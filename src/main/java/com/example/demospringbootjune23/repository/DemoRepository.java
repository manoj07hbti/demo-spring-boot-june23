package com.example.demospringbootjune23.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {

    public String inform(){
        return "this data retreiving from database";
    }
}
