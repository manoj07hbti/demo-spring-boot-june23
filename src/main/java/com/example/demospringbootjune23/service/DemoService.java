package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class DemoService {
@Autowired
DemoRepository repository;
    public String serviceMessage(){
      //  DemoRepository obj=new DemoRepository();
        return repository.RepositoryMessage();
    }
}
