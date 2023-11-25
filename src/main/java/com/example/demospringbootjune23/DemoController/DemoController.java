package com.example.demospringbootjune23.DemoController;

import com.example.demospringbootjune23.Service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/massage")
    public String massage(){
        DemoService obj=new DemoService();
        obj.massage();
        return  obj.massage();
    }
}
