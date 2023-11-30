package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "EMPLOYEE_TABLE")// it will make this java class as Database Table

public class Employee {


    @Id // it will make this field primary key:it will allow only unique identity
    @GeneratedValue // it will automatically provide value to id column
    Long id;


    public String empName;
    public int empId;
    public String dept;
    public String city;


    //default constructor
    public Employee() {
    }

    public Employee(String city) {
        this.city = city;
    }

    public Employee(String empName, int empId, String dept) {
        this.empName = empName;
        this.empId = empId;
        this.dept = dept;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
