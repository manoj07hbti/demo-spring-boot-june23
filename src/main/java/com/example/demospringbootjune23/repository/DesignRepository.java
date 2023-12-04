package com.example.demospringbootjune23.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DesignRepository {
    public String message(){
        return "This message is from repository layer here the call between controller service & repository";
    }
}
