package my.resume.Spring.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.model.MissionStatement;
import my.resume.Spring.repository.MissionStatementRepository;

@Service
public class MissionStatementService {
    @Autowired
    MissionStatementRepository repository;
    public List<MissionStatement> getAll(){
        return repository.findAll();
    }

    public Optional<MissionStatement> getById(Long id){
        return repository.findById(id);
    }

    public MissionStatement createOrUpdate (MissionStatement missionObject){
        Optional<MissionStatement> missionFind = repository.findById(missionObject.getId());
        missionFind.ifPresent(existingMission -> {
            existingMission.setMyCareer(missionObject.getMyCareer());

            repository.save(existingMission);
        });

        return missionFind.orElseGet(() -> repository.save(missionObject));
    }
    
    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
