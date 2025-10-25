package my.resume.Spring.model;


import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ContactInfo {

    @Id
    @GeneratedValue 
    private Long id;
    
    private String firstName;
    private String lastName;
    private String cellPhone;
    private String email;
    private String gitHubRepo;
    private String webSite;

    @Embedded
    private Address address;

}
