package my.resume.Spring.converter;

import my.resume.Spring.dto.MissionStatementDTO;
import my.resume.Spring.model.MissionStatement;

public class MissionStatementConverter {
    public static MissionStatement dtoToEntity (MissionStatementDTO dto){
        if (dto == null){
            return null;
        }

        MissionStatement missionObject = new MissionStatement();
        missionObject.setMyCareer(dto.getMyCareer());

        return missionObject;
    }

    public static MissionStatementDTO toDTO (MissionStatement entity){
        if (entity == null) {
            return null;
        }

        MissionStatementDTO dto = new MissionStatementDTO();
        dto.setMyCareer(entity.getMyCareer());

        return dto;
    }

    public static MissionStatement toEntity (MissionStatementDTO dto) {
        if (dto == null){
            return null;
        }

        MissionStatement entity = new MissionStatement();
        entity.setMyCareer(dto.getMyCareer());

        return entity;
    }
}
