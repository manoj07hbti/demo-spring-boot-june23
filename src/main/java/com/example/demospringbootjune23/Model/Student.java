package com.example.demospringbootjune23.Model;

public class Student {
    String Name;
    int Age;
    String Section;

    public Student(String name, int age, String section) {
        Name = name;
        Age = age;
        Section = section;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }
}
