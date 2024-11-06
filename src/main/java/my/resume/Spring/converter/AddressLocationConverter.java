package my.resume.Spring.converter;

import my.resume.Spring.dto.AddressLocationDTO;
import my.resume.Spring.exception.ValidationException;
import my.resume.Spring.model.AddressLocation;
import my.resume.Spring.service.AddressUtility;

public class AddressLocationConverter {
    public static AddressLocation dtoToEntity(AddressLocationDTO dto) {
        if (dto == null) {
            return null; // Prevent NullPointerException
        }
    
        AddressLocation address = new AddressLocation();
        address.setStreetNumber(dto.getStreetNumber());
        address.setStreetName(dto.getStreetName());
        address.setCity(dto.getCity());
        address.setState(dto.getState());
        address.setZipCode(dto.getZipCode());
    
        try {
            // Validate and format the entity before proceeding
            AddressUtility.formatAddressForDTO(address);
        } catch (ValidationException e) {
            throw new RuntimeException("Address validation failed: " + e.getMessage());
        }
    
        return address;
    }


    public static AddressLocationDTO toDTO(AddressLocation entity){
       if (entity == null){
        return null;
       }
       
        AddressLocationDTO dto = new AddressLocationDTO();
        dto.setStreetNumber(entity.getStreetNumber());
        dto.setStreetName(entity.getStreetName());
        dto.setCity(entity.getCity());
        dto.setState(entity.getState());
        dto.setZipCode(entity.getZipCode());
        dto.setFormattedAddress(entity.getFormattedAddress());

        return dto;
    }

    public static AddressLocation toEntity(AddressLocationDTO dto){
        if (dto == null){
            return null;
        }

        AddressLocation entity = new AddressLocation();
        entity.setStreetNumber(dto.getStreetNumber());
        entity.setStreetName(dto.getStreetName());
        entity.setCity(dto.getCity());
        entity.setState(dto.getState());
        entity.setZipCode(dto.getZipCode());
        

        return entity;


    }
}
