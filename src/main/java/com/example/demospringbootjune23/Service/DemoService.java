package com.example.demospringbootjune23.Service;

import com.example.demospringbootjune23.Repository.DemoRepository;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String massage(){
        DemoRepository obj=new DemoRepository();
        obj.massage();

        return   obj.massage();

    }
}
