package my.resume.Spring.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Education {
    @Id
    @GeneratedValue 
    private Long id;
    private String name;
    private String[][] collegeSemester;//Spring, 2024 to Fall, 2024
    private String degree;
    private AddressLocation educationAddress;

}
