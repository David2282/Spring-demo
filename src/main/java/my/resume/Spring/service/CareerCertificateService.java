package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

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
        AtomicReference<CareerCertificate> result = new AtomicReference<>();
        Optional<CareerCertificate> careerCertFind = repository.findById(careerCertObject.getId());
            careerCertFind.ifPresentOrElse(existingCareerCert -> {
                existingCareerCert.setCertificate(careerCertObject.getCertificate());
                existingCareerCert.setCompletionDate(careerCertObject.getCompletionDate());
                result.set(repository.save(existingCareerCert));
            }, () -> {

                result.set(repository.save(careerCertObject));
            });
            return result.get();
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
