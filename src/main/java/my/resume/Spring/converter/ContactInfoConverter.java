package my.resume.Spring.converter;


import my.resume.Spring.dto.ContactInfoDTO;
import my.resume.Spring.model.ContactInfo;


public class ContactInfoConverter {
    public static ContactInfo dtoToEntity(ContactInfoDTO dto){
       

        ContactInfo contactInfoObject = new ContactInfo();
        contactInfoObject.setFirstName(dto.getFirstName());
        contactInfoObject.setLastName(dto.getLastName());
        contactInfoObject.setCellPhone(dto.getCellPhone());
        contactInfoObject.setEmail(dto.getEmail());
        contactInfoObject.setGitHubRepo(dto.getGitHubRepo());
        contactInfoObject.setWebSite(dto.getWebSite());
        contactInfoObject.setAddress(dto.getAddress());

        
        return contactInfoObject;
    }


public static ContactInfoDTO toDTO(ContactInfo entity){
   
    ContactInfoDTO dto = new ContactInfoDTO();
    dto.setFirstName(entity.getFirstName());
    dto.setLastName(entity.getLastName());
    dto.setCellPhone(entity.getCellPhone());
    dto.setEmail(entity.getEmail());
    dto.setGitHubRepo(entity.getGitHubRepo());
    dto.setWebSite(entity.getWebSite());
    dto.setAddress(entity.getAddress());
    

    return dto;

}

}
