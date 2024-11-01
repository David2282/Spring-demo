package my.resume.Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Builder
public class Skills {
    @Id
    @GeneratedValue 
    
    private Long id;
    private int yearsOfUse;
    private String skillName;

}
