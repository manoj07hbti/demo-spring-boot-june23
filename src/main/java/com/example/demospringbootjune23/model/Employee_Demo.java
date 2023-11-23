package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee_Demo {

    @Id
    @GeneratedValue

    Long id;
    String EmpName;

    String EmpID;

    String EmpCompany;

    int EmpSalary;

    public Employee_Demo() {

    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String empID) {
        EmpID = empID;
    }

    public String getEmpCompany() {
        return EmpCompany;
    }

    public void setEmpCompany(String empCompany) {
        EmpCompany = empCompany;
    }

    public int getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(int empSalary) {
        EmpSalary = empSalary;
    }

    public Employee_Demo(String empName, String empID, String empCompany, int empSalary) {
        EmpName = empName;
        EmpID = empID;
        EmpCompany = empCompany;
        EmpSalary = empSalary;
    }


}