package my.resume.Spring.converter;

import my.resume.Spring.dto.EducationDTO;
import my.resume.Spring.model.Education;



public class EducationConverter {
    public static Education dtoToEntity(EducationDTO dto){
        if (dto == null) return null;

        Education e = new Education();
        e.setName(dto.getName());
        e.setSemester(dto.getSemester());
        e.setDegree(dto.getDegree());
        e.setAddress(AddressConverter.dtoToEntity(dto.getAddress()));
        
        return e;
    }
    
    public static EducationDTO toDTO(Education entity) {
        if (entity == null) return null;
        
    
        EducationDTO dto = new EducationDTO();
        dto.setName(entity.getName());
        dto.setSemester(entity.getSemester());
        dto.setDegree(entity.getDegree());
        dto.setAddress(AddressConverter.toDTO(entity.getAddress()));
        
        return dto;
    }
    
    
}