package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.exception.ResourceNotfoundException;
import my.resume.Spring.model.MissionStatement;
import my.resume.Spring.repository.MissionStatementRepository;

@Service
public class MissionStatementService {
    @Autowired
    MissionStatementRepository repository;

    public List<MissionStatement> getAll() {
        return repository.findAll();
    }

    public MissionStatement getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Mission statement not found with id: " + id));
    }

    public MissionStatement createOrUpdate(MissionStatement missionObject) {
        AtomicReference<MissionStatement> result = new AtomicReference<>();
        Optional<MissionStatement> missionFind = repository.findById(missionObject.getId());
        missionFind.ifPresentOrElse(existingMission -> {
            existingMission.setMyCareer(missionObject.getMyCareer());
            result.set(repository.save(existingMission));
        }, () -> {
            result.set(repository.save(missionObject));
        });

        return result.get();
    }

    public void deleteById(Long id) {
        MissionStatement missionStatement = repository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Mission statement not found with id: " + id));
        repository.deleteById(missionStatement.getId());
    }
}
