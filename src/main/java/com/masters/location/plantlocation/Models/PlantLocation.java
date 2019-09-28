package com.masters.location.plantlocation.Models;

import javax.persistence.*;

@Entity //used to denote that this class is going to be an Entity in the database.
@Table(name = "plantlocation") //which takes some values like the name you are going to name your table
public class PlantLocation {

    //@Id   //denotes that the id is the primary key / identifying key for this table
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String country;
    private double latitude;
    private double longitude;

    public PlantLocation() {  }

    //This constructor will be used when I supply form data to the controller.
    public PlantLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public PlantLocation(String country, double latitude, double longitude){
        super();
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double longitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
