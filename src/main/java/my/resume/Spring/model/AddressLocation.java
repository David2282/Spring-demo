package my.resume.Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class AddressLocation {
    @Id
    @GeneratedValue

    private Long id;
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;
    private int zipCode;
}
