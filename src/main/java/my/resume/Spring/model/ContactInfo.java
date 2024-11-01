package my.resume.Spring.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import my.resume.Spring.service.WorkExperienceUtility;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class ContactInfo {
//list of work experience objects. Service level list of work exp objects
    @Id
    @GeneratedValue 
    private Long id;
    private String cellPhone;
    private String email;
    private String gitHubRepo;
    private String webSite;
    private List<WorkExperienceUtility> contactInfoAddress;

}
