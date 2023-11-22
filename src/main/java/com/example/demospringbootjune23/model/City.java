package com.example.demospringbootjune23.model;

public class City {

    int pinCode;
    String cityName;


    public City(int pinCode, String cityName) {
        this.pinCode = pinCode;
        this.cityName = cityName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
