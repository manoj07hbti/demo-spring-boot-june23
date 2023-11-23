package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "DOCTOR_DETAILS")
public class Doctor {
@Id
        @GeneratedValue
    Long id;
    String name;
    String specialization;
    Long experience;

    public Doctor() {
    }

    public Doctor(Long id, String name, String specialization, Long experience) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }
}
