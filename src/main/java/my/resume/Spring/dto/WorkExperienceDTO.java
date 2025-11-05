package my.resume.Spring.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperienceDTO {
    
    private String employer;
    private LocalDate startDate;
    private LocalDate endDate;
    private String role;
    private String workExperienceType;
    private List<String> workExperienceData;
    private String workExperienceHighlight;
    private AddressDTO address;
}
