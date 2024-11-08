package my.resume.Spring.utility.validationutilities;

import my.resume.Spring.exception.ValidationException;
import my.resume.Spring.messages.ValidationMessages;

public class ValidationSpecialCaseUtility {
    public static void validateStreetDetails(String streetName, Integer streetNumber){
    if ((streetName == null || streetName.trim().isEmpty()) && streetNumber == null) {
        throw new ValidationException(ValidationMessages.STREET_DETAILS_INCOMPLETE);
    }
    }

    public static void validateStreetNumberWhenNameIsPresent(String streetName, Integer streetNumber){
        if (streetName != null && !streetName.trim().isEmpty() && streetNumber == null) {
            throw new ValidationException(ValidationMessages.STREET_NUMBER_MISSING);
        }
    }

    public static void validateStreetNameWhenNumberIsPresent(String streetName, Integer streetNumber){
        if (streetNumber != null && (streetName == null || streetName.trim().isEmpty())) {
            throw new ValidationException(ValidationMessages.STREET_NAME_MISSING);
        }
    }
}
