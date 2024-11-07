package my.resume.Spring.validation;

import my.resume.Spring.exception.ValidationException;
import my.resume.Spring.model.AddressLocation;

public class AddressUtilityValidator {
    public static void AddressUtilityValidate (AddressLocation address) {

        // Validation for street number
        if (address.getStreetNumber() == 0) {
            throw new ValidationException("Street number cannot be zero or empty");
        }
    
        // Validation for street name
        if (address.getStreetName() == null || address.getStreetName().isEmpty()) {
            throw new ValidationException("Street name cannot be null or empty");
        }
    
        // Validation for city
        if (address.getCity() == null || address.getCity().isEmpty()) {
            throw new ValidationException("City cannot be null or empty");
        }
    
        // Validation for state
        if (address.getState() == null || address.getState().isEmpty()) {
            throw new ValidationException("State cannot be null or empty");
        }
    
        // Validation for zip code
        if (address.getZipCode() == 0) {
            throw new ValidationException("Zip code cannot be zero or empty");
        }
    }
}
