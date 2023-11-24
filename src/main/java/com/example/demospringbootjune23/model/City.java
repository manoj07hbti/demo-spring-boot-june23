package com.example.demospringbootjune23.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="CITY_TABLE")// it will make this java class as Database Table
public class City {

    @Id // it will make this field primary key:it will allow only unique identity
    @GeneratedValue // it will automatically provide value to id column
    int cityRanking;
    public String CityName;

    public double CityPopulation;

    public City() {
    }

    public City(String cityName, double cityPopulation) {
        CityName = cityName;
        CityPopulation = cityPopulation;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public double getCityPopulation() {
        return CityPopulation;
    }

    public void setCityPopulation(double cityPopulation) {
        CityPopulation = cityPopulation;
    }
}
