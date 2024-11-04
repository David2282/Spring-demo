package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.model.Accomplishments;
import my.resume.Spring.repository.AccomplishmentsRepository;

@Service
public class AccomplishmentsService {

    @Autowired//when this class starts, automatically instantiate an object that's directly beneath me. this injects the dependency for the accomplishments repo
    AccomplishmentsRepository repository;
    /* Base service Methods: getAll, getById, createOrUpdate (Create or edit method- if not made it will make one, if made it will edit), deleteById
     * These are basic C.R.U.D methods
     * automatic Spring Boot functionality
     * test13
     */

    public List<Accomplishments> getAll(){
        
        return repository.findAll();
   
    }
    //kind of like a getter in that it "gets" Accomplishments class by looking at the @Id
    public Optional<Accomplishments> getById(Long id){
        return repository.findById(id);
    }

    //CRUD Method to create a new accomplishment obj or update a current one. It check if id is present to either update it or create a new one to update later
    public Accomplishments createOrUpdate(Accomplishments accompObject){
        Optional<Accomplishments> accompFind = repository.findById(accompObject.getId());
            accompFind.ifPresent(existingAccomplishments -> {
                
                existingAccomplishments.setOverallAccomplishments(accompObject.getOverallAccomplishments());
                repository.save(existingAccomplishments);
    
            }); 

            return accompFind.orElseGet(() -> repository.save(accompObject));

    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
