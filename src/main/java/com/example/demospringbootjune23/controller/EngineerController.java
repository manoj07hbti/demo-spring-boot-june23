package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Engineer;
import com.example.demospringbootjune23.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EngineerController {

    @Autowired
    EngineerService service;

    @PostMapping("/add_engi")

    public String add(@RequestBody Engineer engineer) {

        return service.add(engineer);

    }


    @GetMapping("/get_all_engi")

    public List<Engineer> getAllEngineerDatabase() {

        return service.getAllEngineerDatabase();

    }

    @PutMapping("/update_engi_database")

    public String updateName(@RequestParam String name, @RequestParam Long id) {

        return service.updateName(name, id);


    }

    @DeleteMapping("/delete_engi_database/{id}")

    public String delete(@PathVariable Long id) {


        return service.removeById(id);
    }


}



