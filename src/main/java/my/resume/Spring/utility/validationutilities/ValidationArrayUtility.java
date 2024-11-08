package my.resume.Spring.utility.validationutilities;


import my.resume.Spring.exception.ValidationException;
import my.resume.Spring.messages.ValidationMessages;

public class ValidationArrayUtility {
    public static void validateArrayNotNull (Object[] array){
        if (array == null){
            throw new ValidationException(ValidationMessages.ARRAY_NOT_NULL);
        }
    }

    public static void validateArrayNotEmpty (Object[] array){
        if (array.length == 0){
            throw new ValidationException(ValidationMessages.ARRAY_NOT_EMPTY);
        }
    }

}
