package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity// it will make this java class as Database Table
public class ENGINEER_TABLE {

    @Id // it will make this field primary key:it will allow only unique identity
    @GeneratedValue // it will automatically provide value to id column
    Long id;
    public String empName;
    public int engID;
    public String city;

    public ENGINEER_TABLE() {
    }

    public ENGINEER_TABLE(String empName, int engID, String city) {
        this.empName = empName;
        this.engID = engID;
        this.city = city;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEngID() {
        return engID;
    }

    public void setEngID(int engID) {
        this.engID = engID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}



