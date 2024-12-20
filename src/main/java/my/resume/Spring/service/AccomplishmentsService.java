package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.exception.ResourceNotfoundException;
import my.resume.Spring.model.Accomplishments;
import my.resume.Spring.repository.AccomplishmentsRepository;

@Service
public class AccomplishmentsService {

    @Autowired
    AccomplishmentsRepository repository;
    
    public List<Accomplishments> getAll(){
        
        return repository.findAll();
    }
   
    public Accomplishments getById(Long id){
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotfoundException("Accomplisment not found with id: " + id));
    }

    public Accomplishments createOrUpdate(Accomplishments accompObject){
        // Using AtomicReference to maintain a final reference ina  lambda
        AtomicReference<Accomplishments> result = new AtomicReference<>();
        Optional<Accomplishments> accompFind = repository.findById(accompObject.getId());


            // Using ifPresentOrElse to handle update or create scenarios        
            accompFind.ifPresentOrElse(existingAccomplishments -> {
                existingAccomplishments.setOverallAccomplishments(accompObject.getOverallAccomplishments());
                result.set(repository.save(existingAccomplishments));
            }, () -> { 

            result.set(repository.save(accompObject));
    });

            return result.get();
}

    public void deleteById(Long id){
        // Explicitly check if the entity exists before deleting
        Accomplishments accomplishments = repository.findById(id)
            .orElseThrow(() -> new ResourceNotfoundException("Accomplishment not found with id: " + id));

        repository.delete(accomplishments);
    }
}
