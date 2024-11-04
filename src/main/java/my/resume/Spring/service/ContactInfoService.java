package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.model.ContactInfo;
import my.resume.Spring.repository.ContactInfoRepository;

@Service
public class ContactInfoService {
    @Autowired
    ContactInfoRepository repository;
    public List<ContactInfo> getAll(){
        return repository.findAll();
    }

    public Optional<ContactInfo> getById(Long id){
        return repository.findById(id);
    }

    public ContactInfo createOrUpdate(ContactInfo contactObject){
        Optional<ContactInfo> contactFind = repository.findById(contactObject.getId());
        contactFind.ifPresent(existingContact -> {
            existingContact.setFirstName(contactObject.getFirstName());
            existingContact.setLastName(contactObject.getLastName());
            existingContact.setCellPhone(contactObject.getCellPhone());
            existingContact.setEmail(contactObject.getEmail());
            existingContact.setGitHubRepo(contactObject.getGitHubRepo());
            existingContact.setWebSite(contactObject.getWebSite());
            existingContact.setContactInfoAddress(contactObject.getContactInfoAddress());

            repository.save(existingContact);
        });

        return contactFind.orElseGet(() -> repository.save(contactObject));
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
