package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="EMP_JUNE_23")
public class Employee {
@Id
@GeneratedValue
    Long id;
    public String empName;
    public int    empId;
    public   String  dept;
    public String city;

    public Employee(Long id, String empName, int empId, String dept, String city) {
        this.id = id;
        this.empName = empName;
        this.empId = empId;
        this.dept = dept;
        this.city = city;
    }

    public Employee(String name, int id, String dept, String city) {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee() {
    }

    public Employee(String empName, int empId, String dept) {
        this.empName = empName;
        this.empId = empId;
        this.dept = dept;
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
