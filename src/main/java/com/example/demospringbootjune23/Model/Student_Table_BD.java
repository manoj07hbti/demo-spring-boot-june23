package com.example.demospringbootjune23.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity()
public class Student_Table_BD {
    @Id
    @GeneratedValue
    Long id;
    String Name;
    int Age;
    String Section;
    String City;

    public Student_Table_BD() {
    }

    public Student_Table_BD(String name, int age, String section, String city) {
        Name = name;
        Age = age;
        Section = section;
        City = city;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
