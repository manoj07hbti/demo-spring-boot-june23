package com.example.demospringbootjune23.model;

public class CountryName {

    String countryName;
    String totalState;
    int countryPopulation;


    public CountryName(String countryName, String totalState, int countryPopulation) {
        this.countryName = countryName;
        this.totalState = totalState;
        this.countryPopulation = countryPopulation;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getTotalState() {
        return totalState;
    }

    public void setTotalState(String totalState) {
        this.totalState = totalState;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
        this.countryPopulation = countryPopulation;
    }
}
