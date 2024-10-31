package my.resume.Spring.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class WorkExperience {
/*annotations are a way to tell springboot what this is.
Entity tells java, "this is a database table. It's attributes are the columns"*/
    private @Id
    @GeneratedValue Long id;
    private String employer;
    private LocalDate startDate;
    private LocalDate endDate;
    private String role;
    private String workExperienceType;
    private List<String> workExperienceData;
    private String workExperienceHighlight;
    
    
    //Constructor
    public WorkExperience (String employer, LocalDate startDate, LocalDate endDate, String role, String workExperienceType, List<String> workExperienceData, String workExperienceHighlight) {
        this.employer = employer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.role = role;
        this.workExperienceHighlight = workExperienceHighlight;
        this.workExperienceData = workExperienceData;
        this.workExperienceType = workExperienceType;
    }


    //Getters
    public String getEmployer() {
        return employer;
    }

    public LocalDate getStartDate(){
        return startDate;
    }

    public LocalDate getEndDate(){
        return endDate;
    }

    public String getRole(){
        return role;
    }

    public String getWorkExperienceType() {
        return workExperienceType; 
    }

    public String getWorkExperienceHighlight() {
        return workExperienceHighlight;
    }

    public List<String> getWorkExperienceDate() {
        return workExperienceData;
    }

    //Setters
    public void setEmployer(String employer){
        this.employer = employer;
    }

    public void setStartDate(LocalDate startDate){
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate){
        this.endDate = endDate;
    }
    
    public void setRole(String role){
        this.role = role;
    }
    
    public void setWorkExperienceType(String workExperienceType) {
        this.workExperienceType = workExperienceType;
    }

    public void setWorkExperienceHighlight(String workExperienceHighlight){
        this.workExperienceHighlight = workExperienceHighlight;
    }

    public void setWorkExperienceData(List<String> workExperienceData){
        this.workExperienceData = workExperienceData;
    }
}
