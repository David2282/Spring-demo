package my.resume.Spring.converter;


import my.resume.Spring.dto.ContactInfoDTO;
import my.resume.Spring.model.ContactInfo;


public class ContactInfoConverter {

    public static ContactInfo dtoToEntity(ContactInfoDTO dto){
        if (dto == null) return null;

        ContactInfo out = new ContactInfo();
        out.setFirstName(dto.getFirstName());
        out.setLastName(dto.getLastName());
        out.setCellPhone(dto.getCellPhone());
        out.setEmail(dto.getEmail());
        out.setGitHubRepo(dto.getGitHubRepo());
        out.setWebSite(dto.getWebSite());
        
        // Convert AddressDTO -> Address
        out.setAddress(AddressConverter.dtoToEntity(dto.getAddress()));
        //build success
        
        return out;
    }


public static ContactInfoDTO toDTO(ContactInfo entity){
    if (entity == null) return null;

    ContactInfoDTO dto = new ContactInfoDTO();
    dto.setFirstName(entity.getFirstName());
    dto.setLastName(entity.getLastName());
    dto.setCellPhone(entity.getCellPhone());
    dto.setEmail(entity.getEmail());
    dto.setGitHubRepo(entity.getGitHubRepo());
    dto.setWebSite(entity.getWebSite());
    dto.setAddress(AddressConverter.toDTO(entity.getAddress()));
    
    return dto;
    }

}
