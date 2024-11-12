package my.resume.Spring.validation;

import my.resume.Spring.model.Education;
import my.resume.Spring.utility.validationutilities.ValidationArrayUtility;
import my.resume.Spring.utility.validationutilities.ValidationStringUtility;

public class EducationValidator {
    public static void validate(Education education){
        ValidationStringUtility.validateStringNotEmpty(education.getName());
        ValidationStringUtility.validateStringNotEmpty(education.getDegree());
        ValidationArrayUtility.validateArrayNotEmpty(education.getCollegeSemester());
        ValidationStringUtility.validateStringNotNull(education.getName());

    }
}
