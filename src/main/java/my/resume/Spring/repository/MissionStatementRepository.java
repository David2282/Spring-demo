package my.resume.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.resume.Spring.model.MissionStatement;

public interface MissionStatementRepository extends JpaRepository<MissionStatement, Long> {

}
