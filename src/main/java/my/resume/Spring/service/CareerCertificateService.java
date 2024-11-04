package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.model.CareerCertificate;
import my.resume.Spring.repository.CareerCertificateRepository;

@Service
public class CareerCertificateService {
    @Autowired
    CareerCertificateRepository repository;

    public List<CareerCertificate> getAll(){
        return repository.findAll();
    }

    public Optional<CareerCertificate> getById(Long id){
        return repository.findById(id);
    }

    public CareerCertificate createOrUpdate (CareerCertificate careerCertObject){
        Optional<CareerCertificate> careerCertFind = repository.findById(careerCertObject.getId());
            careerCertFind.ifPresent(existingCareerCert -> {
                existingCareerCert.setCertificate(careerCertObject.getCertificate());
                existingCareerCert.setCompletionDate(careerCertObject.getCompletionDate());

                repository.save(existingCareerCert);

            });
            return careerCertFind.orElseGet(() -> repository.save(careerCertObject));
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
