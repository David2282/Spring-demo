package my.resume.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.resume.Spring.model.Education;

public interface EducationRepository extends JpaRepository<Education, Long>{

}
