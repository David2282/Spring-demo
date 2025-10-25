package my.resume.Spring.converter;

import org.springframework.stereotype.Component;

import my.resume.Spring.dto.EducationDTO;
import my.resume.Spring.model.Education;
import my.resume.Spring.model.Address;

@Component
public class EducationConverter {
    public static Education dtoToEntity(EducationDTO dto){
        if (dto == null) return null;

        Education e = new Education();
        e.setId(dto.getId());
        e.setName(dto.getName());
        e.setSemester(dto.getSemester());
        e.setDegree(dto.getDegree());
        
        Address addr = dto.getAddress();
        e.setAddress(addr);
       
        
        return e;
    }
    
    public static EducationDTO toDTO(Education entity) {
        if (entity == null) return null;
        
    
        EducationDTO dto = new EducationDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSemester(entity.getSemester());
        dto.setDegree(entity.getDegree());
        dto.setAddress(entity.getAddress());
        
       
    
        return dto;
    }
    
    
}