package com.example.demospringbootjune23.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public String RepositoryMessage(){
        return "message from repository";
    }
}
