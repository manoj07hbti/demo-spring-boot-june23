package com.example.demospringbootjune23.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DoctorDataBase {

    @Id
    @GeneratedValue
    Long id;
    String name;
    int age;
    String city;
    String degree;
    int fess;
    // default constructor
    public DoctorDataBase() {
    }

    public DoctorDataBase(String name, int age, String city, String degree, int fess) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.degree = degree;
        this.fess = fess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getFess() {
        return fess;
    }

    public void setFess(int fess) {
        this.fess = fess;
    }
}
