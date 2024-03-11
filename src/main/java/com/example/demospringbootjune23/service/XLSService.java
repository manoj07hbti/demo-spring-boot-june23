package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.File;
import com.example.demospringbootjune23.repository.XLSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XLSService {

    @Autowired
    XLSRepository repository;

    public List<File>getAllFileEntities(){
        return repository.findAll();
    }
    //other methods as needed
}
