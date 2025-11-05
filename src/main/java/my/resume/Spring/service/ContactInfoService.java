package my.resume.Spring.service;

import java.util.List;

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

    public ContactInfo createOrUpdate(ContactInfo incoming) {
        // If no ID, this is a create
        if (incoming.getId() == null) {
            return repository.save(incoming);
        }

        // Otherwise, update existing (or 404 if missing)
        ContactInfo existing = repository.findById(incoming.getId())
            .orElseThrow(() -> new ResourceNotfoundException("Contact Info not found with id: " + incoming.getId()));

        existing.setFirstName(incoming.getFirstName());
        existing.setLastName(incoming.getLastName());
        existing.setCellPhone(incoming.getCellPhone());
        existing.setEmail(incoming.getEmail());
        existing.setGitHubRepo(incoming.getGitHubRepo());
        existing.setWebSite(incoming.getWebSite());

        // Use the Lombok-generated getter/setter for 'address'
        if (incoming.getAddress() != null) {
            existing.setAddress(incoming.getAddress());
        }

        return repository.save(existing);
        
    }

    public void deleteById(Long id) {
        ContactInfo contactInfo = repository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Contact Info not found with id: " + id));
        repository.deleteById(contactInfo.getId());
    }
}
