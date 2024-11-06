package my.resume.Spring.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import my.resume.Spring.service.WorkExperienceUtility;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactInfoDTO {
    private String firstName;
    private String lastName;
    private String cellPhone;
    private String email;
    private String gitHubRepo;
    private String webSite;
    private List<WorkExperienceUtility> contactInfoAddress;
}
