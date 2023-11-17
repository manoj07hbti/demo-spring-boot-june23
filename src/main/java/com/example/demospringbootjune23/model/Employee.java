package com.example.demospringbootjune23.Model;

public class Employee {
    String EmpName;
    int EmpId;
    String Dept;

    public Employee(String empName, int empId, String dept) {
        EmpName = empName;
        EmpId = empId;
        Dept = dept;
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

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }
}
