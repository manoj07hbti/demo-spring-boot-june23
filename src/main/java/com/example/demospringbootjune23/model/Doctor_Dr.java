package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Doctor_D")
public class Doctor_Dr {

    @Id
    @GeneratedValue
    Long id;
    String name;
    int Id_no;
    String course;

    public Doctor_Dr() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id_no;
    }

    public void setId(int id) {
        Id_no = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Doctor_Dr(String name, int id, String course) {
        this.name = name;
        Id_no = id;
        this.course = course;
    }
}
