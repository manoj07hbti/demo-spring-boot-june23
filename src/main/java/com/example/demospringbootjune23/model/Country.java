package com.example.demospringbootjune23.model;

public class Country {

    public String countName;

    public String countCap;

    public Country() {
    }

    public Country(String countName, String countCap) {
        this.countName = countName;
        this.countCap = countCap;
    }

    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public String getCountCap() {
        return countCap;
    }

    public void setCountCap(String countCap) {
        this.countCap = countCap;
    }
}
