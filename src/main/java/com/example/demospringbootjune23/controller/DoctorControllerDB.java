package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Doctor;
import com.example.demospringbootjune23.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorControllerDB {

    @Autowired
    DoctorService service; // autowired service layer

    //C-CREATE
    @PostMapping("/dr_data_add")
    public String add(@RequestBody Doctor doctor){
        return service.add(doctor);
    }
    //R-READ
    @GetMapping("/get_dr_list")
    public List<Doctor> getAllDrList(){
        return service.getAllDrList();
    }

    @PutMapping("/update_dr_name/{id}/{name}")
    public String update_dr_name(@PathVariable Long id,@PathVariable String name){
        return service.update_dr_name(id,name);
    }
    @DeleteMapping("/dr_deletebyid")
    public String removebyid(@RequestParam Long id){
        return service.removebyid(id);
    }
}
