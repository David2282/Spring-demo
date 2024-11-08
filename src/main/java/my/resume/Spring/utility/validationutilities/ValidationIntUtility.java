package my.resume.Spring.utility.validationutilities;

import my.resume.Spring.exception.ValidationException;
import my.resume.Spring.messages.ValidationMessages;

public class ValidationIntUtility {
    public static void validateIntNotZero(int value){
        if (value == 0){
            throw new ValidationException(ValidationMessages.INT_NOT_ZERO);
        }
    }

    public static void validateIntNotNegative(int value){
        if (value < 0){
            throw new ValidationException(ValidationMessages.INT_POSITIVE);
        }
    }

    public static void validateIntIsInRange(int value, int min, int max){
        if (value < min || value > max) {
            throw new ValidationException(ValidationMessages.INT_IN_RANGE);
        }
    }

    public static void validateIntNotNull(Integer value) {
        if (value == null){
            throw new ValidationException(ValidationMessages.INT_VALUE_REQUIRED);
        }
    }
}
