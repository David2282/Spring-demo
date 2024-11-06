package my.resume.Spring.service;

import my.resume.Spring.model.AddressLocation;
import my.resume.Spring.dto.AddressLocationDTO;
import my.resume.Spring.exception.ValidationException;

public class AddressUtility {
    public static AddressLocation validateAndFormat(AddressLocation address) throws ValidationException {
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
    
        // Formatting address
        String formattedAddress = String.format(
            """
            %d %s
            %s, %s
            %d
            """,
            address.getStreetNumber(),
            address.getStreetName(),
            address.getCity(),
            address.getState(),
            address.getZipCode()
        );
    
        // Set the formatted address (if you have a field for this in the model)
        address.setFormattedAddress(formattedAddress);
    
        return address;
    }

    public static AddressLocation formatAddressForDTO(AddressLocation address) throws ValidationException {
        // Reuse the validation and formatting logic
        return validateAndFormat(address);
    }
    public static AddressLocationDTO toDTO(AddressLocation address) {
        if (address == null) {
            return null; // Prevent NullPointerException
        }

        AddressLocationDTO dto = new AddressLocationDTO();
        dto.setStreetNumber(address.getStreetNumber());
        dto.setStreetName(address.getStreetName());
        dto.setCity(address.getCity());
        dto.setState(address.getState());
        dto.setZipCode(address.getZipCode());
        dto.setFormattedAddress(address.getFormattedAddress());

        return dto;
    }

}    