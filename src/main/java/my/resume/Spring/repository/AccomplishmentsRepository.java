package my.resume.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.resume.Spring.model.Accomplishments;


public interface AccomplishmentsRepository extends JpaRepository<Accomplishments, Long> {
//logic same for all classes <Model name, Id- Long>
}
