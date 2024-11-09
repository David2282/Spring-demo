package my.resume.Spring.validation;

import my.resume.Spring.model.Accomplishments;
import my.resume.Spring.utility.validationutilities.ValidationArrayUtility;

public class AccomplishmentsValidator {
    public static void validate(Accomplishments accomplishments) {
        ValidationArrayUtility.validateArrayNotNull(accomplishments.getOverallAccomplishments());
        ValidationArrayUtility.validateArrayNotEmpty(accomplishments.getOverallAccomplishments());
    }
}