package com.example.demospringbootjune23.Model2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Teacher_Data")
public class Teacher {
    @Id
    @GeneratedValue
    Long id;
    String name;

    String subject;

    int id_no;

    public Teacher() {
    }

    public Teacher(String name, String subject, int id_no) {
        this.name = name;
        this.subject = subject;
        this.id_no = id_no;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }
}
