package my.resume.Spring.service;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.model.Accomplishments;
import my.resume.Spring.repository.AccomplishmentsRepository;

@Service
public class AccomplishmentsService {

    @Autowired//when this class starts, automatically instantiate an object that's directly beneath me
    AccomplishmentsRepository repository;
    /* Base service Methods: getAll, getById, createOrUpdate (Create or edit method- if not made it will make one, if made it will edit), deleteById
     * These are basic C.R.U.D methods
     * automatic Spring Boot functionality
     * 
     */

    public List<Accomplishments> getAll(){
        List<Accomplishments> accomplishmentsList = repository.findAll();

        if(!accomplishmentsList.isEmpty()){
            return accomplishmentsList;
        } 
        else {
            return new ArrayList<>();
        }
    }

    public Optional<Accomplishments> getById(Long id){
        return repository.findById(id);
    }

    public Accomplishments createOrUpdate(Accomplishments accompObject){
        Optional<Accomplishments> accmplshmnts = repository.findById(accompObject.getId());
            if(accmplshmnts.isPresent()){
                Accomplishments newAccomplishments = accmplshmnts.get();
                newAccomplishments.setOverallAccomplishments(accompObject.getOverallAccomplishments());

                newAccomplishments = repository.save(newAccomplishments);

                return newAccomplishments;
            } else {
                return repository.save(accompObject);
            }

    }










    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
