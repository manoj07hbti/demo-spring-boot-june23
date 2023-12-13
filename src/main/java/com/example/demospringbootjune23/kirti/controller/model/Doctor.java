package com.example.demospringbootjune23.kirti.controller.model;

public class Doctor {
    String name;
    int age;
    String specialist;
    double salary;

    public Doctor(String name, int age, String specialist, double salary) {
        this.name = name;
        this.age = age;
        this.specialist = specialist;
        this.salary = salary;
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

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
