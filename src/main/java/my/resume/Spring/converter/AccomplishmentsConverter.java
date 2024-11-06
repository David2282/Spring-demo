package my.resume.Spring.converter;

import my.resume.Spring.dto.AccomplishmentsDTO;
import my.resume.Spring.model.Accomplishments;

public class AccomplishmentsConverter {

    // Converts an entity to a DTO
    public static AccomplishmentsDTO toDTO(Accomplishments entity) {
        AccomplishmentsDTO dto = new AccomplishmentsDTO();
        dto.setOverallAccomplishments(entity.getOverallAccomplishments());
        return dto;
    }

    // Converts a DTO to an entity
    public static Accomplishments toEntity(AccomplishmentsDTO dto) {
        Accomplishments entity = new Accomplishments();
        entity.setOverallAccomplishments(dto.getOverallAccomplishments());
        return entity;
    }
}
