package my.resume.Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@Builder
public class AddressLocation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;
    private int zipCode;
    private String formattedAddress;
}
