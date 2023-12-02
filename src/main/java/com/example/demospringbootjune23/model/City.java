package com.example.demospringbootjune23.model;

public class City {
    String cityName;
    String state;
    int population;

    public City(String cityName, String state, int population) {
        this.cityName = cityName;
        this.state = state;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
