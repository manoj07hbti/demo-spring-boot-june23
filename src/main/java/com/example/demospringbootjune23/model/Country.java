package com.example.demospringbootjune23.model;

public class Country {

    public String countryName;
    public String countryOrigin;
    public int population;

    public Country() {
    }

    public Country(String countryName, String countryOrigin, int population) {
        this.countryName = countryName;
        this.countryOrigin = countryOrigin;
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
