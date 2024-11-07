package my.resume.Spring.converter;

import my.resume.Spring.dto.EducationDTO;
import my.resume.Spring.exception.ValidationException;
import my.resume.Spring.model.Education;
import my.resume.Spring.service.AddressUtility;

public class EducationConverter {
    public static Education dtoToEntity(EducationDTO dto){
        if(dto == null){
            return null;
        }

        Education eduObject = new Education();
        eduObject.setName(dto.getName());
        eduObject.setCollegeSemester(dto.getCollegeSemester());
        eduObject.setDegree(dto.getDegree());

        if (dto.getEducationAddress() != null) {
            eduObject.setEducationAddress(AddressLocationConverter.dtoToEntity(dto.getEducationAddress()));
         try {
            // Validate and format the entity before proceeding
            AddressUtility.validateAndFormat(eduObject.getEducationAddress());
         } catch (ValidationException e) {
            throw new RuntimeException("Address validation failed: " + e.getMessage());
         }
        }
        return eduObject;
    }
    
    public static EducationDTO toDTO(Education entity) {
        if (entity == null) {
            return null;
        }
    
        EducationDTO dto = new EducationDTO();
        dto.setName(entity.getName());
        dto.setCollegeSemester(entity.getCollegeSemester());
        dto.setDegree(entity.getDegree());
        
        // Convert address from Entity to DTO
        if (entity.getEducationAddress() != null) {
            dto.setEducationAddress(AddressLocationConverter.toDTO(entity.getEducationAddress()));
        }
    
        return dto;
    }
    
    public static Education toEntity(EducationDTO dto) {
        if (dto == null) {
            return null;
        }
    
        Education entity = new Education();
        entity.setName(dto.getName());
        entity.setCollegeSemester(dto.getCollegeSemester());
        entity.setDegree(dto.getDegree());
        
        // Convert address from DTO to Entity
        if (dto.getEducationAddress() != null) {
            entity.setEducationAddress(AddressLocationConverter.dtoToEntity(dto.getEducationAddress()));
        }
    
        return entity;
    }
}
