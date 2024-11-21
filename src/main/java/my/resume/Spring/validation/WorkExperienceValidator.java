package my.resume.Spring.validation;

import my.resume.Spring.model.WorkExperience;
import my.resume.Spring.utility.validationutilities.ValidationDateUtility;
import my.resume.Spring.utility.validationutilities.ValidationStringUtility;

public class WorkExperienceValidator {
    public static void workExperienceValidate(WorkExperience experience) {
        ValidationStringUtility.validateStringNotNull(experience.getEmployer());
        ValidationStringUtility.validateStringNotNull(experience.getRole());
        ValidationStringUtility.validateStringNotEmpty(experience.getEmployer());
        ValidationStringUtility.validateStringNotEmpty(experience.getRole());
        ValidationDateUtility.validateDateNotNull(experience.getStartDate());
        ValidationDateUtility.validateDateNotInFuture(experience.getStartDate());
        ValidationDateUtility.validateDateNotNull(experience.getEndDate());
        ValidationDateUtility.validateDateNotInFuture(experience.getEndDate());
        ValidationStringUtility.validateStringNotNull(experience.getWorkExperienceType());
        ValidationStringUtility.validateStringNotEmpty(experience.getWorkExperienceType());
        ValidationStringUtility.validateStringNotNull(experience.getWorkExperienceHighlight());
        ValidationStringUtility.validateStringNotEmpty(experience.getWorkExperienceHighlight());
        
    }
}
