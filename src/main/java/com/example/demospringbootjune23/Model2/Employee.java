package com.example.demospringbootjune23.Model2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Engineer_2023")
public class Employee {

    @GeneratedValue
     @Id
     Long id;

    String name;

    int id_no;

    String city;

    public Employee() {
    }

    public Employee(String name, int id_no, String city) {
        this.name = name;
        this.id_no = id_no;
        this.city = city;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
