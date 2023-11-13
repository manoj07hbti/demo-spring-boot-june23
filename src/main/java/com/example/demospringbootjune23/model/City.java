package com.example.demospringbootjune23.model;

public class City {

    String cityName;
    int cityPop;
    int cityVillage;

    public City(String cityName, int cityPop, int cityVillage) {
        this.cityName = cityName;
        this.cityPop = cityPop;
        this.cityVillage = cityVillage;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityPop() {
        return cityPop;
    }

    public void setCityPop(int cityPop) {
        this.cityPop = cityPop;
    }

    public int getCityVillage() {
        return cityVillage;
    }

    public void setCityVillage(int cityVillage) {
        this.cityVillage = cityVillage;
    }
}
