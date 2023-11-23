package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name ="ENGINEER_DETAILS")
public class Engineer {
    @Id
            @GeneratedValue
    Long id;
    String name;
    String city;
    String depart;

    public Engineer() {
    }

    public Engineer(Long id, String name, String city, String depart) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.depart = depart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
}
