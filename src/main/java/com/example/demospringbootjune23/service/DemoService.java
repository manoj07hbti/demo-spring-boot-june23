package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    DemoRepository demoRepository;
    public String inform(){
        return demoRepository.inform();
    }

}
