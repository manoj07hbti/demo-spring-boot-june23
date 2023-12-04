package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Engineer_Table")
public class Engineer {
    @Id
    @GeneratedValue
    long id;
    String name;
    int id_no;
    String subject;

    //default
    public Engineer() {
    }

    public Engineer(String name, int id_no, String subject) {
        this.name = name;
        this.id_no = id_no;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
