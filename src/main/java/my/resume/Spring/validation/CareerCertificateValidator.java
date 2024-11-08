package my.resume.Spring.validation;

import java.time.LocalDate;

import my.resume.Spring.exception.ValidationException;
import my.resume.Spring.model.CareerCertificate;

public class CareerCertificateValidator {
    public static void validate(CareerCertificate certificate){
        if (certificate.getCompletionDate() == null){
            throw new ValidationException("Completion date cannot be null");
        }

        if (certificate.getCompletionDate().isAfter(LocalDate.now())){
            throw new ValidationException("Completion date cannot be in the future");
        }

        if (certificate.getCompletionDate() != null && certificate.getCertificate() == null || certificate.getCertificate().isEmpty()) {
            throw new ValidationException("Completion Date valid but missing certificate");
        }

        if (certificate.getCertificate() == null || certificate.getCertificate().isEmpty()){
            throw new ValidationException("Certificate cannot be null");
        }

        if (certificate.getCertificate().isEmpty()){
            throw new ValidationException("Certificate cannot be empty");
        }
        if (certificate.getCertificate() != null && certificate.getCompletionDate() == null){
            throw new ValidationException("Certificate valid but missing Completion Date");
        }

        if (certificate.getCertificate() != null && certificate.getCompletionDate().isAfter(LocalDate.now())){
            throw new ValidationException("Certificate valid but Completion date is in the future");
        }
    }
}
