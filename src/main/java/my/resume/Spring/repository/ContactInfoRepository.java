package my.resume.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.resume.Spring.model.ContactInfo;

public interface ContactInfoRepository extends JpaRepository<ContactInfo, Long> {

}
