package my.resume.Spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationDTO {
    private String name;
    private String semester;//Spring, 2024 to Fall, 2024
    private String degree;
    private AddressDTO address;
    
    
}
