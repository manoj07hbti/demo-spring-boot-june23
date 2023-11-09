package com.example.demospringbootjune23.model_class;

public class Employee {

    public String empName;

    public int empID;

    public String empDepartment;

    public Employee(String empName, int empID, String empDepartment) {
        this.empName = empName;
        this.empID = empID;
        this.empDepartment = empDepartment;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }
}
