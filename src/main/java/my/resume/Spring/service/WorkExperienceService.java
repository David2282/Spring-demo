package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.model.WorkExperience;
import my.resume.Spring.repository.WorkExperienceRepository;

@Service
public class WorkExperienceService {
    @Autowired
    WorkExperienceRepository repository;

    public List<WorkExperience> getAll() {
        return repository.findAll();
        
    }

    public Optional<WorkExperience> getById(Long id){
        return repository.findById(id);
    }

    public WorkExperience createOrUpdate(WorkExperience workObject){
        Optional<WorkExperience> workfind = repository.findById(workObject.getId());
        workfind.ifPresent(existingWork -> {
            existingWork.setEmployer(workObject.getEmployer());
            existingWork.setStartDate(workObject.getStartDate());
            existingWork.setEndDate(workObject.getEndDate());
            existingWork.setRole(workObject.getRole());
            existingWork.setWorkExperienceType(workObject.getWorkExperienceType());
            existingWork.setWorkExperienceData(workObject.getWorkExperienceData());
            existingWork.setWorkExperienceHighlight(workObject.getWorkExperienceHighlight());

            repository.save(existingWork);
        });

        return workfind.orElseGet(() -> repository.save(workObject));
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
