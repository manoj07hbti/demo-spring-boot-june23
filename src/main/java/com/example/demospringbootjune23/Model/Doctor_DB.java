package com.example.demospringbootjune23.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor_DB {
    @Id
     @GeneratedValue
    Long id;
    String DoctorName;
    int Age;
    String City;
    int Fees;

    public Doctor_DB() {
    }

    public Doctor_DB(String doctorName, int age, String city, int fees) {
        DoctorName = doctorName;
        Age = age;
        City = city;
        Fees = fees;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getFees() {
        return Fees;
    }

    public void setFees(int fees) {
        Fees = fees;
    }
}
