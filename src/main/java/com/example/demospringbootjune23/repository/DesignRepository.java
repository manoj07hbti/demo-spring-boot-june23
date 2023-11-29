package com.example.demospringbootjune23.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DesignRepository {
    public String message(){
        return "this message return from repository class layer....";
    }
}
