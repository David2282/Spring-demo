package my.resume.Spring.converter;

import my.resume.Spring.dto.SkillsDTO;
import my.resume.Spring.model.Skills;

public class SkillsConverter {
    public static Skills dtoToEntity (SkillsDTO dto) {
        if (dto == null) {
            return null;
        }
        
        Skills skillsObject = new Skills();
        skillsObject.setYearsOfUse(dto.getYearsOfUse());
        skillsObject.setSkillName(dto.getSkillName());

        return skillsObject;
    }

    public static SkillsDTO toDTO (Skills entity){
        if (entity == null){
            return null;
        }

        SkillsDTO dto = new SkillsDTO();
        dto.setYearsOfUse(entity.getYearsOfUse());
        dto.setSkillName(entity.getSkillName());

        return dto;
    }

    public static Skills toEntity (SkillsDTO dto){
        if (dto == null) {
            return null;
        }

        Skills entity = new Skills();
        entity.setYearsOfUse(dto.getYearsOfUse());
        entity.setSkillName(dto.getSkillName());

        return entity;
    }
}
