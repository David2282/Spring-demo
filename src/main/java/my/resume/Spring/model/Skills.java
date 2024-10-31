package my.resume.Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Skills {
    private @Id
    @GeneratedValue Long id;
    private int yearsOfUse;
    private String skillName;

    //Constructor
    public Skills(int yearsOfUse, String skillName){
        this.yearsOfUse = yearsOfUse;
        this.skillName = skillName;
    }

    //Getters
    public int getYearsOfUse(){
        return yearsOfUse;
    }

    public String getSkillName(){ 
        return skillName;
    }

    //Setters
    public void setYearsOfUse(int yearsOfUse){
        this.yearsOfUse = yearsOfUse;
    }

    public void setSkillName(String skillName){
        this.skillName = skillName;
    }
    

}
