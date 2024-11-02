package my.resume.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.resume.Spring.model.Skills;

public interface SkillsRepository extends JpaRepository<Skills, Long> {

}
