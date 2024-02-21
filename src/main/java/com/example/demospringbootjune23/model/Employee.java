package com.example.demospringbootjune23.model;

public class Employee {

    public String empName;

    public int empId;

    public String dept;

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



