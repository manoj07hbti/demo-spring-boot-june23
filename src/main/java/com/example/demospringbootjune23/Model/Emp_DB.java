package com.example.demospringbootjune23.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Emp_DB {
    @Id
    @GeneratedValue
    Long id;
    String EmpName;
    int EmpId;
    String EmpCity;

    public Emp_DB() {
    }

    public Emp_DB(String empName, int empId, String empCity) {
        EmpName = empName;
        EmpId = empId;
        EmpCity = empCity;

    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpCity() {
        return EmpCity;
    }

    public void setEmpCity(String empCity) {
        EmpCity = empCity;
    }
}
