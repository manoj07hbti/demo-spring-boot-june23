package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dr_Class {
    @Id
    @GeneratedValue
    Long id;
    String DrName;
    String DrDegree;
    int DrFess;
    int DrSalary;

    public Dr_Class() {

    }

    public Dr_Class(String drName, String drDegree, int drFess, int drSalary) {
        DrName = drName;
        DrDegree = drDegree;
        DrFess = drFess;
        DrSalary = drSalary;
    }

    public String getDrName() {
        return DrName;
    }

    public void setDrName(String drName) {
        DrName = drName;
    }

    public String getDrDegree() {
        return DrDegree;
    }

    public void setDrDegree(String drDegree) {
        DrDegree = drDegree;
    }

    public int getDrFess() {
        return DrFess;
    }

    public void setDrFess(int drFess) {
        DrFess = drFess;
    }

    public int getDrSalary() {
        return DrSalary;
    }

    public void setDrSalary(int drSalary) {
        DrSalary = drSalary;
    }
}
