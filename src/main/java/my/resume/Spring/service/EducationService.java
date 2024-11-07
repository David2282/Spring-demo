package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.exception.ResourceNotfoundException;
import my.resume.Spring.model.Education;
import my.resume.Spring.repository.EducationRepository;

@Service
public class EducationService {
    @Autowired
    EducationRepository repository;

    public List<Education> getAll() {
        return repository.findAll();
    }

    public Education getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Education not found with id: " + id));
    }

    public Education createOrUpdate(Education educationObject) {
        AtomicReference<Education> result = new AtomicReference<>();
        Optional<Education> educationFind = repository.findById(educationObject.getId());
        educationFind.ifPresentOrElse(existingEducation -> {
            existingEducation.setName(educationObject.getName());
            existingEducation.setEducationAddress(educationObject.getEducationAddress());
            existingEducation.setCollegeSemester(educationObject.getCollegeSemester());
            existingEducation.setDegree(educationObject.getDegree());
            result.set(repository.save(existingEducation));
        }, () -> {
            result.set(repository.save(educationObject));
        });

        return result.get();
    }

    public void deleteById(Long id) {
        Education education = repository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Education not found with id: " + id));
        repository.deleteById(education.getId());
    }
}
