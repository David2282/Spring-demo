package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.model.AddressLocation;
import my.resume.Spring.repository.AddressLocationRepository;

@Service
public class AddressLocationService {
    @Autowired
    AddressLocationRepository repository;
     public List<AddressLocation> getAll(){
        
            return repository.findAll();
        } 
   
      public Optional<AddressLocation> getById(Long id){
        return repository.findById(id);
      }

      public AddressLocation createOrUpdate(AddressLocation addressLocObject){
        AtomicReference<AddressLocation> result = new AtomicReference<>();
        Optional<AddressLocation> addressLocFind = repository.findById(addressLocObject.getId());
       
           addressLocFind.ifPresentOrElse(existingAddress -> {
            existingAddress.setStreetNumber(addressLocObject.getStreetNumber());
            existingAddress.setStreetName(addressLocObject.getStreetName());
            existingAddress.setCity(addressLocObject.getCity());
            existingAddress.setState(addressLocObject.getState());
            existingAddress.setZipCode(addressLocObject.getZipCode());
            result.set(repository.save(existingAddress));
           }, () -> {
            
            result.set(repository.save(addressLocObject));
            });
            
            return result.get();
            }
    
    public void deleteById(Long id){
        repository.deleteById(id);
    }
}