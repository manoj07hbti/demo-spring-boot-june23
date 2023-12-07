package com.example.demospringbootjune23.kirti.controller.pathvariablecontroller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    String Name;
    int ID;
    String Dpt;
    double Salary;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDpt() {
        return Dpt;
    }

    public void setDpt(String dpt) {
        Dpt = dpt;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public Employee(String name, int ID, String dpt, double salary) {
        Name = name;
        this.ID = ID;
        Dpt = dpt;
        Salary = salary;
    }
}

