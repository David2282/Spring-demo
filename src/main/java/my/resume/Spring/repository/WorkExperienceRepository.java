package my.resume.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.resume.Spring.model.WorkExperience;

public interface WorkExperienceRepository extends JpaRepository<WorkExperience, Long> {

}
