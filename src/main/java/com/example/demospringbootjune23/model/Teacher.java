package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity( name ="TEACHER_DATA")
public class Teacher {

    @Id
    @GeneratedValue
    long id;
    String name;
    int id_no;
    String subject;

    public Teacher() {
    }

    public Teacher(String name, int id_no, String subject) {
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
