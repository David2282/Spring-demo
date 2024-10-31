package my.resume.Spring.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@Entity
public class CareerCertificate {
    @Id
    @GeneratedValue 
    private Long id;
    private LocalDate completionDate;
    private String certificate;
     
    /*//Constructor
    public CareerCertificate(LocalDate completionDate, String certificate){
        this.completionDate = completionDate;
        this.certificate = certificate;
    }

    //Getters
    public LocalDate getcompletionDate(){
        return completionDate;
    }

    public String getCertificate(){
        return certificate;
    }
    //Setters
    public void setCompletionDate(LocalDate completionDate){
        this.completionDate = completionDate;
    }

    public void setCertificate(String certificate){
        this.certificate = certificate;
    }
    */

}
