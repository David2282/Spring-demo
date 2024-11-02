package my.resume.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.resume.Spring.model.Accomplishments;

//When you extend JpaRepository in your repository interface, you are effectively saying, “I want this repository to have all the capabilities of a JPA repository.”
public interface AccomplishmentsRepository extends JpaRepository<Accomplishments, Long> {
//logic same for all classes <Model name, Id- Long>
}
