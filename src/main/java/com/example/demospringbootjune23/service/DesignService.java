package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.repositroy.DesignRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DesignService {


    @Autowired
    DesignRepositroy repositroy;
    public String massage(){


        return repositroy.massage();
    }




}
