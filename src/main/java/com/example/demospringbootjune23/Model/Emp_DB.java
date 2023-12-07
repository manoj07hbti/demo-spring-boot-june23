package com.example.demospringbootjune23.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Emp_DB {
    @Id
    @GeneratedValue
    Long id;
    String empName;
    int empId;
    String empCity;

    public Emp_DB() {
    }

    public Emp_DB(String empName, int empId, String empCity) {
        this.empName = empName;
        this.empId = empId;
        this.empCity = empCity;

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

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }
}
