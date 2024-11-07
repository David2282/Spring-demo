package my.resume.Spring.converter;

import my.resume.Spring.dto.CareerCertificateDTO;
import my.resume.Spring.exception.ValidationException;
import my.resume.Spring.model.CareerCertificate;

public class CareerCertificateConverter {
    public static CareerCertificate dtoToEntity(CareerCertificateDTO dto){
        if (dto == null){
            return null;
        }

            CareerCertificate certObject = new CareerCertificate();
            certObject.setCompletionDate(dto.getCompletionDate());
            certObject.setCertificate(dto.getCertificate());

            try {
               //ValitationUtility.validateCareerCert(certObject); 
            } catch (ValidationException e) {
                throw new RuntimeException("Validation failed: " + e.getMessage());
            }

        return certObject;
    }

    public static CareerCertificateDTO toDTO (CareerCertificate entity){
        if (entity == null){
            return null;
        }
        CareerCertificateDTO dto = new CareerCertificateDTO();
        dto.setCompletionDate(entity.getCompletionDate());
        dto.setCertificate(entity.getCertificate());

        return dto;
    }

    public static CareerCertificate toEntity (CareerCertificateDTO dto) {
        if (dto == null){
            return null;
        }

        CareerCertificate entity = new CareerCertificate();
        entity.setCompletionDate(dto.getCompletionDate());
        entity.setCertificate(dto.getCertificate());

        return entity;
    }
}
