package my.resume.Spring.utility.validationutilities;

import my.resume.Spring.exception.ValidationException;
import my.resume.Spring.messages.ValidationMessages;

public class ValidationObjectUtility {
    public void validateObjectNotNull(Object object, String fieldName) {
        if (object == null) {
            throw new ValidationException(String.format(ValidationMessages.OBJECT_NOT_NULL, fieldName));
        }
    }
}
