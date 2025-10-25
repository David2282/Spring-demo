package my.resume.Spring.converter;

import my.resume.Spring.dto.WorkExperienceDTO;
import my.resume.Spring.model.WorkExperience;

public class WorkExperienceConverter {
    public static WorkExperienceDTO toDTO (WorkExperience entity){
       

        WorkExperienceDTO dto = new WorkExperienceDTO();
        dto.setEmployer(entity.getEmployer());
        dto.setStartDate(entity.getStartDate());
        dto.setEndDate(entity.getEndDate());
        dto.setRole(entity.getRole());
        dto.setWorkExperienceType(entity.getWorkExperienceType());
        dto.setWorkExperienceHighlight(entity.getWorkExperienceHighlight());
        dto.setWorkExperienceData(entity.getWorkExperienceData());
        dto.setAddress(entity.getAddress());

        return dto;
    }

    public static WorkExperience toEntity (WorkExperienceDTO dto){
        

        WorkExperience entity = new WorkExperience();
        entity.setEmployer(dto.getEmployer());
        entity.setStartDate(dto.getStartDate());
        entity.setEndDate(dto.getEndDate());
        entity.setRole(dto.getRole());
        entity.setWorkExperienceType(dto.getWorkExperienceType());
        entity.setWorkExperienceHighlight(dto.getWorkExperienceHighlight());
        entity.setWorkExperienceData(dto.getWorkExperienceData());
        entity.setAddress(dto.getAddress());
        
        return entity;
    }
}
