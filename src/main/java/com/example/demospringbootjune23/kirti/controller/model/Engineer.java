package com.example.demospringbootjune23.kirti.controller.model;

public class Engineer {
    String name;
    int age;
    String dpt;
    double salary;

    public Engineer(String name, int age, String dpt, double salary) {
        this.name = name;
        this.age = age;
        this.dpt = dpt;
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

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
