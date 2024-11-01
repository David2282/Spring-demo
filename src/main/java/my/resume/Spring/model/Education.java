package my.resume.Spring.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import my.resume.Spring.service.WorkExperienceUtility;
@Getter
@Setter
@Builder
@Entity
public class Education {
    @Id
    @GeneratedValue 
    private Long id;
    private String name;
    private List<WorkExperienceUtility> collegeAddress;
    private String[][] collegeSemester;//Spring, 2024 to Fall, 2024
    private String degree;
}
