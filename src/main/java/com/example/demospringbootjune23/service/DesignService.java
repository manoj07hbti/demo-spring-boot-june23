package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.repository.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesignService {

@Autowired
DesignRepository repository;
    public String message(){
        //DesignRepository obj= new DesignRepository();
        return repository.message();
    }
}
