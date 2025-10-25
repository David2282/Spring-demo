package my.resume.Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity //Entity tells Spring Boot "this is a Model"
@Getter
@Setter
public class Accomplishments {
    @Id
    @GeneratedValue
    private Long id;
    
    private String[] overallAccomplishments;

}




