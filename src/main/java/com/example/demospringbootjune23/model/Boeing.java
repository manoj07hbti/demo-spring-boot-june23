package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Boeing {

    @Id

    @GeneratedValue

    Long id;

    public String planeName;

    public int passengerCapacity;

    public Boeing(String planeName, int passengerCapacity) {
        this.planeName = planeName;
        this.passengerCapacity = passengerCapacity;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public Boeing() {
    }
}
