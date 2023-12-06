package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Doctor;
import com.example.demospringbootjune23.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DBControllerDoctor {
    @Autowired
    DoctorService service;


    //create
    @PostMapping("/add_dr_db")
    public String add(@RequestBody Doctor doctor) {
        return service.add(doctor);

    }
    //Read
    @GetMapping("/get_all_dr")
    public List<Doctor> getAllDr() {

        return service.getAllDr();
    }
    //update
    @PutMapping("/update_dr_db")
    public String updateName(@RequestParam String name, @RequestParam Long id){

        return service.updateName(name, id);

    }
    //Remove
    @DeleteMapping("/delete_dr_db/{id}")
    public String remove(@PathVariable Long id){

        return service.removeById(id);
    }
}
