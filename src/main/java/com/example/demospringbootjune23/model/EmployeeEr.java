package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeEr {
    @Id
    @GeneratedValue
    Long id;
    String empName;
    int doxNo;
    String city;

    public EmployeeEr() {
    }

    public EmployeeEr(String empName, int doxNo, String city) {
        this.empName = empName;
        this.doxNo = doxNo;
        this.city = city;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDoxNo() {
        return doxNo;
    }

    public void setDoxNo(int doxNo) {
        this.doxNo = doxNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
