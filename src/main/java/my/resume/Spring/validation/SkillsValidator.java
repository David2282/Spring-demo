package my.resume.Spring.validation;

import my.resume.Spring.model.Skills;
import my.resume.Spring.utility.validationutilities.ValidationIntUtility;
import my.resume.Spring.utility.validationutilities.ValidationStringUtility;

public class SkillsValidator {
    public static void validate(Skills skills){
        ValidationIntUtility.validateIntNotNegative(skills.getYearsOfUse());
        ValidationIntUtility.validateIntNotNull(skills.getYearsOfUse());
        ValidationStringUtility.validateStringNotNull(skills.getSkillName());
        ValidationStringUtility.validateStringNotEmpty(skills.getSkillName());
    }
}
