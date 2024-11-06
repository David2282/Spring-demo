package my.resume.Spring.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.resume.Spring.exception.ResourceNotfoundException;
import my.resume.Spring.model.CareerCertificate;
import my.resume.Spring.repository.CareerCertificateRepository;

@Service
public class CareerCertificateService {
    @Autowired
    CareerCertificateRepository repository;

    public List<CareerCertificate> getAll() {
        return repository.findAll();
    }

    public CareerCertificate getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Career Certificate not found with id: " + id));
    }

    public CareerCertificate createOrUpdate(CareerCertificate careerCertObject) {
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

    public void deleteById(Long id) {
        CareerCertificate careerCertificate = repository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Career Certificate not found with id: " + id));
        repository.deleteById(careerCertificate.getId());
    }
}

