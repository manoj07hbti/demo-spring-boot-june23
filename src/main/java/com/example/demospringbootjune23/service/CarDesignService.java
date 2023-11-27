package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.repository.CarDesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarDesignService {

    @Autowired
    CarDesignRepository repository;

    public String carManufacturing() {
        return repository.carManufacturing();
    }

}
