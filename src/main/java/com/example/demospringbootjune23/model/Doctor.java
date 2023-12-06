package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Doctor_data")
public class Doctor {
    @Id
    @GeneratedValue
    long id;
    String name;
    String spec;
    int const_fee;

    public Doctor() {
    }

    public Doctor(String name, String spec, int const_fee) {
        this.name = name;
        this.spec = spec;
        this.const_fee = const_fee;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getConst_fee() {
        return const_fee;
    }

    public void setConst_fee(int const_fee) {
        this.const_fee = const_fee;
    }
}
