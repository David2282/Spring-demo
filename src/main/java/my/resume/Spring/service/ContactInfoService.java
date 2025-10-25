package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.exception.ResourceNotfoundException;
import my.resume.Spring.model.ContactInfo;
import my.resume.Spring.repository.ContactInfoRepository;

@Service
public class ContactInfoService {
    @Autowired
    ContactInfoRepository repository;

    public List<ContactInfo> getAll() {
        return repository.findAll();
    }

    public ContactInfo getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Contact Info not found with id: " + id));
    }

    public ContactInfo createOrUpdate(ContactInfo contactObject) {
        

        AtomicReference<ContactInfo> result = new AtomicReference<>();
        Optional<ContactInfo> contactFind = repository.findById(contactObject.getId());
        contactFind.ifPresentOrElse(existingContact -> {
            existingContact.setFirstName(contactObject.getFirstName());
            existingContact.setLastName(contactObject.getLastName());
            existingContact.setCellPhone(contactObject.getCellPhone());
            existingContact.setEmail(contactObject.getEmail());
            existingContact.setGitHubRepo(contactObject.getGitHubRepo());
            existingContact.setWebSite(contactObject.getWebSite());
            existingContact.setContactInfoAddress(contactObject.getContactInfoAddress());
            result.set(repository.save(existingContact));
        }, () -> {
            result.set(repository.save(contactObject));
        });

        return result.get();
    }

    public void deleteById(Long id) {
        ContactInfo contactInfo = repository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Contact Info not found with id: " + id));
        repository.deleteById(contactInfo.getId());
    }
}
