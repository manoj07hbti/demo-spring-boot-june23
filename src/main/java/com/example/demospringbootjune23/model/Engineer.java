package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "EngineerTable")
public class Engineer {

    @Id
    @GeneratedValue
    Long id;

    public String engiName;

    public String engiDept;

    public int salary;

    public Engineer() {
    }

    public Engineer(Long id, String engiName, String engiDept, int salary) {
        this.id = id;
        this.engiName = engiName;
        this.engiDept = engiDept;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEngiName() {
        return engiName;
    }

    public void setEngiName(String engiName) {
        this.engiName = engiName;
    }

    public String getEngiDept() {
        return engiDept;
    }

    public void setEngiDept(String engiDept) {
        this.engiDept = engiDept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
