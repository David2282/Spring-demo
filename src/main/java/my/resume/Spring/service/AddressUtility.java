package my.resume.Spring.service;

import my.resume.Spring.model.AddressLocation;

public class AddressUtility {
    public static AddressLocation format(AddressLocation address) {
        
    
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

}    