package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

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
        AtomicReference<WorkExperience> result = new AtomicReference<>();
        Optional<WorkExperience> workfind = repository.findById(workObject.getId());
        workfind.ifPresentOrElse(existingWork -> {
            existingWork.setEmployer(workObject.getEmployer());
            existingWork.setStartDate(workObject.getStartDate());
            existingWork.setEndDate(workObject.getEndDate());
            existingWork.setRole(workObject.getRole());
            existingWork.setWorkExperienceType(workObject.getWorkExperienceType());
            existingWork.setWorkExperienceData(workObject.getWorkExperienceData());
            existingWork.setWorkExperienceHighlight(workObject.getWorkExperienceHighlight());
            result.set(repository.save(existingWork));
        }, () -> {
            result.set(repository.save(workObject));
        });

        return result.get();
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
