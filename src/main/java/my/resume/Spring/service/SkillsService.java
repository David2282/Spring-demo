package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.model.Skills;
import my.resume.Spring.repository.SkillsRepository;

@Service
public class SkillsService {
    @Autowired
    SkillsRepository repository;
    public List<Skills> getAll(){
        return repository.findAll();
    }

    public Optional<Skills> getById(Long id){
        return repository.findById(id);
    }
    
    public Skills createOrUpdate(Skills skillsObject){
        Optional<Skills> skillsFind = repository.findById(skillsObject.getId());
        skillsFind.ifPresent(existingSkills -> {
            existingSkills.setSkillName(skillsObject.getSkillName());
            existingSkills.setYearsOfUse(skillsObject.getYearsOfUse());

            repository.save(existingSkills);
        }); 

        return skillsFind.orElseGet(() -> repository.save(skillsObject));
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
