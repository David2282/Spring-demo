package my.resume.Spring.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MissionStatement {
    private @Id
    @GeneratedValue Long id;
    private String myCareer;


    //Getters
    public String getMyCareer(){
        return myCareer;
    }

    //Setter, will handle exceptions in exception utility class
    public void setMyCareer(String myCareer){
        this.myCareer = myCareer;
    }

    

}
