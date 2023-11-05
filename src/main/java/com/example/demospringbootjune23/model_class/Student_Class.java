package com.example.demospringbootjune23.model_class;

public class Student_Class {

    String name;

    int age;

    public Student_Class(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    String section;


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
