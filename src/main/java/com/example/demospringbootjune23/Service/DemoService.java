package com.example.demospringbootjune23.Service;

import com.example.demospringbootjune23.Repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    DemoRepository repository;
    public String massage(){
     //   DemoRepository obj=new DemoRepository();
       // obj.massage();

        return  repository.massage();

    }
}
