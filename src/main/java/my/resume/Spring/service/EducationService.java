package my.resume.Spring.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import my.resume.Spring.exception.ResourceNotfoundException;
import my.resume.Spring.model.Education;
import my.resume.Spring.repository.EducationRepository;

@Service
@RequiredArgsConstructor
public class EducationService {

    private final EducationRepository repository;

    @Transactional
    public Education createOrUpdate(Education input) {
        // CREATE
        if (input.getId() == null) {
            return repository.save(input);
        }

        // UPDATE
        Education existing = repository.findById(input.getId())
            .orElseThrow(() -> new ResourceNotfoundException("Education not found with id: " + input.getId()));

        // copy fields you actually have on the entity
        // (adjust these to match your Education fields)
        existing.setName(input.getName());
        existing.setSemester(input.getSemester());
        existing.setAddress(input.getAddress()); // keep this if Address is stable; otherwise skip for now

        return repository.save(existing);
    }

    @Transactional
    public void deleteById(Long id) {
        Education education = repository.findById(id)
            .orElseThrow(() -> new ResourceNotfoundException("Education not found with id: " + id));
        repository.deleteById(education.getId()); // <-- FIXED: getId(), not getid()
    }
}
