package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Doctor_D")
public class Doctor {

    @Id
    @GeneratedValue
    Long id;
    String name;
    int docNo;
    String course;

    public Doctor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocNo() {
        return docNo;
    }

    public void setDocNo(int docNo) {
        this.docNo = docNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Doctor(String name, int docNo, String course) {
        this.name = name;
        this.docNo = docNo;
        this.course = course;
    }
}
