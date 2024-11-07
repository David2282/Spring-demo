package my.resume.Spring.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EducationDTO {
    private String name;
    private String[][] collegeSemester;//Spring, 2024 to Fall, 2024
    private String degree;
    private AddressLocationDTO educationAddress;

}
