package my.resume.Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class AddressLocation {
    private @Id
    @GeneratedValue Long id;

    private int streetNumber;
    private String streetName;
    private String city;
    private String state;
    private int zipCode;

    //Constructor
    public AddressLocation(int streetNumber, String streetName, String city, String state, int zipCode){
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    //Getters
    public int getStreetNumber(){
        return streetNumber;
    }

    public String getStreetName(){
        return streetName;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public int getZipCode(){
        return zipCode;
    }

    //Setters
    public void setStreetNumber(int streetNumber){
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName){
        this.streetName = streetName;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setState(String state){
        this.state = state;
    }

    public void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }
}
