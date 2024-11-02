package my.resume.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.resume.Spring.model.AddressLocation;

public interface AddressLocationRepository extends JpaRepository<AddressLocation, Long> {

}
