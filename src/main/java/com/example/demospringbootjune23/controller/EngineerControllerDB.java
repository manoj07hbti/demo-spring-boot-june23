package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Engineer;
import com.example.demospringbootjune23.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EngineerControllerDB {
    @Autowired
    EngineerService service;

    // C- CREATE OR POST DATA
    @PostMapping("/add_engg")
    public String add(@RequestBody Engineer engineer){
       return service.add(engineer);
    }
    // R- READ OR GET DATA FROM DB...
    @GetMapping("/getengglist")
    public List<Engineer> getEnggdata(){
        return service.getEnggList();
    }
    // U-UPDATE DATA OF DB
    @PutMapping("/update_engg_data")
    public String updateEngg(@RequestParam long id, @RequestParam String name){
        return service.updateEngg(id,name);
    }
    // D- DELETE DATA FROM DB
    @DeleteMapping("/remove_engg_data/{id}")
    public String removeEnggData(@PathVariable long id){
        return service.remove(id);
    }
    // default method delete by name
    // d-delete by name
//    @DeleteMapping("/removby_name/{name}")
//    public Engineer deleteByName(@PathVariable String name){
//        return service.deleteByName(name);
//    }
    // get by name
    @GetMapping("/findbyname/{name}")
    public Engineer getByName(@PathVariable String name){
        return service.getByName(name);
    }
    // get by salary
    @GetMapping("/findbysalary/{salary}")
    public Engineer getBySalary(@PathVariable int salary){
        return service.getBySalary(salary);
    }

    @GetMapping("/getall_engg_native")
    public List<Engineer> getAllEnggNative(){
        return service.getAllEnggList();
    }

    @GetMapping("/find_byname_engg_native/{name}")
    public Engineer getEnggByNameNative(@PathVariable String name){
        return service.getEnggByNameNative(name);}

    @GetMapping("/get_enggdata_byname_and_company/{name}/{company}")
    public Engineer getEnggByNameAndCompanyNative(@PathVariable String name,@PathVariable String company){
        return service.getEnggByNameAndCompanyNative(name,company);
    }

//    @DeleteMapping("/deletebyrangenative/{start}/{end}")
//    public Long deleteByrangeNative(@PathVariable Long start,@PathVariable Long end){
//        return service.deletebyrangeNative(start,end);
//    }


}
