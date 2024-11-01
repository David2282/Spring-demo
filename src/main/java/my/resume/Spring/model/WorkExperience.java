package my.resume.Spring.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@Entity
public class WorkExperience {
/*annotations are a way to tell springboot what this is.
Entity tells java, "this is a database table. It's attributes are the columns"*/
    @Id
    @GeneratedValue 
    private Long id;
    private String employer;
    private LocalDate startDate;
    private LocalDate endDate;
    private String role;
    private String workExperienceType;
    private List<String> workExperienceData;
    private String workExperienceHighlight;
    
}
