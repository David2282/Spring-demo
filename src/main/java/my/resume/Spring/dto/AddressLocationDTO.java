package my.resume.Spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressLocationDTO {
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;
    private int zipCode;
    private String formattedAddress;
}
