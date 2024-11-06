package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.exception.ResourceNotfoundException;
import my.resume.Spring.model.AddressLocation;
import my.resume.Spring.repository.AddressLocationRepository;

@Service
public class AddressLocationService {
    @Autowired
    AddressLocationRepository repository;
     public List<AddressLocation> getAll(){
        
            return repository.findAll();
        } 
   
      public AddressLocation getById(Long id){
        return repository.findById(id)
          .orElseThrow(() -> new ResourceNotfoundException("Address Location not found with id: " + id));
      }

      public AddressLocation createOrUpdate(AddressLocation addressLocObject){
        //Validate and format the address object before proceeding
        AddressUtility.validateAndFormat(addressLocObject);


        AtomicReference<AddressLocation> result = new AtomicReference<>();
        Optional<AddressLocation> addressLocFind = repository.findById(addressLocObject.getId());
       
           addressLocFind.ifPresentOrElse(existingAddress -> {
            existingAddress.setStreetNumber(addressLocObject.getStreetNumber());
            existingAddress.setStreetName(addressLocObject.getStreetName());
            existingAddress.setCity(addressLocObject.getCity());
            existingAddress.setState(addressLocObject.getState());
            existingAddress.setZipCode(addressLocObject.getZipCode());
            existingAddress.setFormattedAddress(addressLocObject.getFormattedAddress());
            result.set(repository.save(existingAddress));
           }, () -> {
            
            result.set(repository.save(addressLocObject));
            });
            
            return result.get();
            }
    
    public void deleteById(Long id){
      AddressLocation addressLocation = repository.findById(id)
            .orElseThrow(() -> new ResourceNotfoundException("Address Location not found with id: " + id));

        repository.delete(addressLocation);
        
    }
}