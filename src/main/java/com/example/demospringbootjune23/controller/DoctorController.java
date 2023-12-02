package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.Model2.DoctorClass;
import com.example.demospringbootjune23.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService service;

    //create
    @PostMapping("/Add_doc_db")
    public String addDoc(@RequestBody DoctorClass doctorClass){
        return service.add(doctorClass);
    }

    @GetMapping("/get_all_doc")
    public List<DoctorClass> getAllDoc(){
        return service.getAllDoc();
    }


    @PutMapping("/update_doc_db")
    public String updateName(@RequestParam String name,@RequestParam Long id){
     return service.updateName(name,id);

    }

    @DeleteMapping("/delete_doc_db/{id}")
    public String delete(@PathVariable Long id){
        return service.removeById(id);

    }

}
