package my.resume.Spring.converter;


import my.resume.Spring.dto.ContactInfoDTO;
import my.resume.Spring.exception.ValidationException;
import my.resume.Spring.model.ContactInfo;
import my.resume.Spring.service.AddressUtility;

public class ContactInfoConverter {
    public static ContactInfo dtoToEntity(ContactInfoDTO dto){
        if (dto == null){
            return null;
        }

        ContactInfo contactInfoObject = new ContactInfo();
        contactInfoObject.setFirstName(dto.getFirstName());
        contactInfoObject.setLastName(dto.getLastName());
        contactInfoObject.setCellPhone(dto.getCellPhone());
        contactInfoObject.setEmail(dto.getEmail());
        contactInfoObject.setGitHubRepo(dto.getGitHubRepo());
        contactInfoObject.setWebSite(dto.getWebSite());

        if (dto.getContactInfoAddress() != null) {
            contactInfoObject.setContactInfoAddress(AddressLocationConverter.dtoToEntity(dto.getContactInfoAddress()));
         try {
            // Validate and format the entity before proceeding
            AddressUtility.validateAndFormat(contactInfoObject.getContactInfoAddress());
         } catch (ValidationException e) {
            throw new RuntimeException("Address validation failed: " + e.getMessage());
         }
        }
        return contactInfoObject;

    }

public static ContactInfoDTO toDTO(ContactInfo entity){
    if(entity == null){
        return null;
    }
    ContactInfoDTO dto = new ContactInfoDTO();
    dto.setFirstName(entity.getFirstName());
    dto.setLastName(entity.getLastName());
    dto.setCellPhone(entity.getCellPhone());
    dto.setEmail(entity.getEmail());
    dto.setGitHubRepo(entity.getGitHubRepo());
    dto.setWebSite(entity.getWebSite());
    
    if (entity.getContactInfoAddress() != null) {
        dto.setContactInfoAddress(AddressLocationConverter.toDTO(entity.getContactInfoAddress()));
    }

    return dto;

}

public static ContactInfo toEntity(ContactInfoDTO dto){
    if(dto == null){
        return null;
    }

    ContactInfo entity = new ContactInfo();
    entity.setFirstName(dto.getFirstName());
    entity.setLastName(dto.getLastName());
    entity.setCellPhone(dto.getCellPhone());
    entity.setEmail(dto.getEmail());
    entity.setGitHubRepo(dto.getGitHubRepo());
    entity.setWebSite(dto.getWebSite());

    if (dto.getContactInfoAddress() != null) {
        entity.setContactInfoAddress(AddressLocationConverter.dtoToEntity(dto.getContactInfoAddress()));
    }
    
    return entity;
}
}
