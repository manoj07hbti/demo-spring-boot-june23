package com.example.demospringbootjune23.Model2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "STUDENT_DATA")
public class Student {

    @Id
    @GeneratedValue
    Long id;
    String name;

    String course;

    int id_no;

    public Student() {
    }

    public Student(String name, String course, int id_no) {
        this.name = name;
        this.course = course;
        this.id_no = id_no;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }
}
