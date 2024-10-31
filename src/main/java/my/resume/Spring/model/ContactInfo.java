package my.resume.Spring.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import my.resume.Spring.service.WorkExperienceUtility;

@Entity
public class ContactInfo {
//list of work experience objects. Service level list of work exp objects
    private @Id
    @GeneratedValue Long id;
    private String cellPhone;
    private String email;
    private String gitHubRepo;
    private String webSite;
    private List<WorkExperienceUtility> contactInfoAddress;

    //Constructor
    public ContactInfo(List<String> address, String cellPhone, String email, String gitHubRepo, String webSite, List<WorkExperienceUtility> contactInfoAddress){
        this.cellPhone = cellPhone;
        this.email = email;
        this.gitHubRepo = gitHubRepo;
        this.webSite = webSite;
        this.contactInfoAddress = contactInfoAddress;
    }

    //Getters
    public String getCellPhone(){
        return cellPhone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getGitHubRepo(){
        return gitHubRepo;
    }

    public String getWebSite(){
        return webSite;
    }

    public List<WorkExperienceUtility> getContactInfoAddress(){
        return contactInfoAddress;
    }





    //Setters
    public void setCellPhone(String cellPhone){
        this.cellPhone = cellPhone;
    }

    public void setEmail(String email){
        this.email = email;

    }

    public void setGitHubRepo(String gitHubRepo){
        this.gitHubRepo = gitHubRepo;

    }

    public void setWebSite(String webSite){
        this.webSite = webSite;

    }
    public void setContactInfoAddress(List<WorkExperienceUtility> contactInfoAddress){
        this.contactInfoAddress = contactInfoAddress;
    }
}
