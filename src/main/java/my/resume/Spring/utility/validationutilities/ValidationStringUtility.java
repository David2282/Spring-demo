package my.resume.Spring.utility.validationutilities;

import my.resume.Spring.exception.ValidationException;
import my.resume.Spring.messages.ValidationMessages;

public class ValidationStringUtility {
    public static void validateStringNotNull (String string){
        if (string == null){
            throw new ValidationException(ValidationMessages.STRING_NOT_NULL);
        }
    }

    public static void validateStringNotEmpty (String string){
        if (string.isEmpty()){
            throw new ValidationException(ValidationMessages.STRING_EMPTY);
        }
    }
}
