package my.resume.Spring.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import my.resume.Spring.service.WorkExperienceUtility;

@Entity
public class Education {
    private @Id
    @GeneratedValue Long id;
    private String name;
    private List<WorkExperienceUtility> collegeAddress;
    private String[][] collegeSemesters = new String[2][2];//Spring, 2024 to Fall, 2024
    private String degree;


    //Constructor
    public Education(String name, List<WorkExperienceUtility> collegeAddress, String[][] collegeSemesters, String degree){
        this.name = name;
        this.collegeAddress = collegeAddress;
        this.collegeSemesters = collegeSemesters;
        this.degree = degree;

    }

    //Getters
    public String getName(){
        return name;
    }

    public List<WorkExperienceUtility> getCollegeAddress(){
        return collegeAddress;
    }

    public String[][] getCollegeSemesters(){
        return collegeSemesters;
    }

    public String getDegree(){
        return degree;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setCollegeAddress(List<WorkExperienceUtility> collegeAddress){
        this.collegeAddress = collegeAddress;
    }
    
    public void setCollegeSemesters(String[][] collegeSemesters){
        this.collegeSemesters = collegeSemesters;
    }

    public void setDegree(String degree){
        this.degree = degree;
    }
}
