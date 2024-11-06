package my.resume.Spring.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import my.resume.Spring.service.WorkExperienceUtility;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EducationDTO {
    private String name;
    private List<WorkExperienceUtility> collegeAddress;
    private String[][] collegeSemester;//Spring, 2024 to Fall, 2024
    private String degree;

}
