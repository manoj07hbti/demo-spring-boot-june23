package com.example.demospringbootjune23.kirti.controller.model;

public class City {
    String name;
    int schools;
    int hospitals;
    int market;

    public City(String name, int schools, int hospitals, int market) {
        this.name = name;
        this.schools = schools;
        this.hospitals = hospitals;
        this.market = market;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchools() {
        return schools;
    }

    public void setSchools(int schools) {
        this.schools = schools;
    }

    public int getHospitals() {
        return hospitals;
    }

    public void setHospitals(int hospitals) {
        this.hospitals = hospitals;
    }

    public int getMarket() {
        return market;
    }

    public void setMarket(int market) {
        this.market = market;
    }
}
