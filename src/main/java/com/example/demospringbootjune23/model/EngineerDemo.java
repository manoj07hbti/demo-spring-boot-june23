package com.example.demospringbootjune23.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EngineerDemo {
    @Id
    @GeneratedValue
    Long id;
    String EngName;

    String EngID;

    String EngCompany;

    int EngSalary;

    public EngineerDemo() {

    }


    public EngineerDemo(String engName, String engID, String engCompany, int engSalary) {
        EngName = engName;
        EngID = engID;
        EngCompany = engCompany;
        EngSalary = engSalary;
    }

    public String getEngName() {
        return EngName;
    }

    public void setEngName(String engName) {
        EngName = engName;
    }

    public String getEngID() {
        return EngID;
    }

    public void setEngID(String engID) {
        EngID = engID;
    }

    public String getEngCompany() {
        return EngCompany;
    }

    public void setEngCompany(String engCompany) {
        EngCompany = engCompany;
    }

    public int getEngSalary() {
        return EngSalary;
    }

    public void setEngSalary(int engSalary) {
        EngSalary = engSalary;
    }
}
