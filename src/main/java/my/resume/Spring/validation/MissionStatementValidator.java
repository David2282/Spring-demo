package my.resume.Spring.validation;

import my.resume.Spring.model.MissionStatement;
import my.resume.Spring.utility.validationutilities.ValidationStringUtility;

public class MissionStatementValidator {
    public static void validate(MissionStatement missionStatement) {
        ValidationStringUtility.validateStringNotEmpty(missionStatement.getMyCareer());
        ValidationStringUtility.validateStringNotNull(missionStatement.getMyCareer());
        
    }
}
