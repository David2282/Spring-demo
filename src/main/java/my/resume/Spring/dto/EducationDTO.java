package my.resume.Spring.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import my.resume.Spring.model.Address;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EducationDTO<address> {
    private String name;
    private String semester;//Spring, 2024 to Fall, 2024
    private String degree;
    private Address address;
    public Long getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Address getAddress() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
