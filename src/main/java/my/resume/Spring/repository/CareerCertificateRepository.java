package my.resume.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.resume.Spring.model.CareerCertificate;

public interface CareerCertificateRepository extends JpaRepository<CareerCertificate, Long> {

}
