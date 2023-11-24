package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="STUDENT_TABLE")// it will make this java class as Database Table

public class Student {
    @Id // it will make this field primary key:it will allow only unique identity
    @GeneratedValue // it will automatically provide value to id column
    int rollNo;
    String name;
    int age;
    String section;

    public Student() {
    }

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
