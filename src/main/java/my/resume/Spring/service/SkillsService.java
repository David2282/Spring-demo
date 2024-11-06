package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.exception.ResourceNotfoundException;
import my.resume.Spring.model.Skills;
import my.resume.Spring.repository.SkillsRepository;

@Service
public class SkillsService {
    @Autowired
    SkillsRepository repository;

    public List<Skills> getAll() {
        return repository.findAll();
    }

    public Skills getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Skill not found with id: " + id));
    }

    public Skills createOrUpdate(Skills skillsObject) {
        AtomicReference<Skills> result = new AtomicReference<>();
        Optional<Skills> skillsFind = repository.findById(skillsObject.getId());
        skillsFind.ifPresentOrElse(existingSkills -> {
            existingSkills.setSkillName(skillsObject.getSkillName());
            existingSkills.setYearsOfUse(skillsObject.getYearsOfUse());
            result.set(repository.save(existingSkills));
        }, () -> {
            result.set(repository.save(skillsObject));
        });

        return result.get();
    }

    public void deleteById(Long id) {
        Skills skills = repository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Skill not found with id: " + id));
        repository.deleteById(skills.getId());
    }
}
