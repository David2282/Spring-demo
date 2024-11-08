package my.resume.Spring.utility.validationutilities;

import java.time.LocalDate;

import my.resume.Spring.exception.ValidationException;
import my.resume.Spring.messages.ValidationMessages;

public class ValidationDateUtility {
    public static void validateDateNotNull (LocalDate date){
        if (date == null){
            throw new ValidationException(ValidationMessages.DATE_NOT_NULL);
        }
    }

    public static void validateDateNotInFuture (LocalDate date){
        if (date.isAfter(LocalDate.now())) {
            throw new ValidationException(ValidationMessages.DATE_NOT_IN_FUTURE);
        }
    }
}
