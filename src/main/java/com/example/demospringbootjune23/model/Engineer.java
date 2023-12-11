package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="engg_data")
public class Engineer {
    @Id
    @GeneratedValue
    long id;
    String name;
    String company;
    int salary;

    // default constructor

    public Engineer() {
    }

    // parameterised constructor

    public Engineer(String name, String company, int salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }
    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
