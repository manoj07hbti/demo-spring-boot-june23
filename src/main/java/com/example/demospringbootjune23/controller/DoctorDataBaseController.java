package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.DOCTOR_TABLE;

import com.example.demospringbootjune23.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DoctorDataBaseController {


    @Autowired
    DoctorService service;


    //CREATE
    @PostMapping("/add_dataBase_doctor")
    public String add(@RequestBody DOCTOR_TABLE doctorTable) {
        return service.add(doctorTable);
    }

    //READ

    @GetMapping("/get_all_dataBase_doctor")
    public List<DOCTOR_TABLE> getAllDoctorDataBase() {

        return service.getAllDoctorDataBase();
    }

    @PutMapping("/update_dataBase_doctor")
    public String updateName(@RequestParam String name, @RequestParam Long id) {

        return service.updateName(name, id);

    }

    @DeleteMapping("/remove_dataBase_doctor/{id}")
    public String delete(@PathVariable Long id) {

        return service.removeById(id);
    }

}
