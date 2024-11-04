package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;

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
        Optional<AddressLocation> addressLocFind = repository.findById(addressLocObject.getId());
        //If the Find obj of the model is found in the repo, then populate the Obj of the model according to the model's properties using it's setters
           addressLocFind.ifPresent(existingAddress -> {
            existingAddress.setStreetNumber(addressLocObject.getStreetNumber());
            existingAddress.setStreetName(addressLocObject.getStreetName());
            existingAddress.setCity(addressLocObject.getCity());
            existingAddress.setState(addressLocObject.getState());
            existingAddress.setZipCode(addressLocObject.getZipCode());

            //Save the updated entity
            repository.save(existingAddress);

            });

            //If it's not found, save the new one
            return addressLocFind.orElseGet(() -> repository.save(addressLocObject));

            }
    
    public void deleteById(Long id){
        repository.deleteById(id);
    }
}