package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Boeing;
import com.example.demospringbootjune23.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PlaneController {

    @Autowired
    PlaneService service;

    @PostMapping("/add_plane_name")

    public String add(@RequestBody Boeing boeing) {

        return service.add(boeing);

    }

    @GetMapping("/get_all_plane")

    public List<Boeing> getAllPlane() {

        return service.getAllPlane();

    }

    @GetMapping("/get_plane_by_id/{id}")

    public Optional<Boeing> getPlaneById(@PathVariable Long id) {

        return service.getPlaneById(id);

    }

    @PutMapping("/update_plane_capacity")

    public String updatePlaneName(@RequestParam String planeName, @RequestParam Long id) {

        return service.updatePlaneName(planeName, id);

    }

    @DeleteMapping("/delete_by_id/{id}")

    public String deleteById(@PathVariable Long id) {


        return service.deleteById(id);

    }


}
