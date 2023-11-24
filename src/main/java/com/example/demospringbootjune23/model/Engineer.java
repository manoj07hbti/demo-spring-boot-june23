package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "ENGINEER_DATA")
public class Engineer {
    @Id
    @GeneratedValue
    long id;

    String name;
    int id_no;
    String Department;

    public Engineer() {
    }

    public Engineer(String name, int id_no, String department) {
        this.name = name;
        this.id_no = id_no;
        Department = department;

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

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
