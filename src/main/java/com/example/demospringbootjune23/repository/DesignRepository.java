package com.example.demospringbootjune23.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DesignRepository {

    public String message(){

        return "This message is coming from REPOSITORY Layer ...";
    }
}
