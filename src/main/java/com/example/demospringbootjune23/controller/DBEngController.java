package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Engineer;
import com.example.demospringbootjune23.service.EngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
public class DBEngController {
    @Autowired
    EngService service;

    @PostMapping("/Db_Eng")
    public String addEngineer(@RequestBody Engineer engineer) {
        return service.add(engineer);

    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*****************************************************
    @GetMapping("/get_eng_db")
    public List<Engineer> getEngineer() {
        return service.getEngineer();

    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*****************************************************
    }

    @GetMapping("/get_eng_search_by_name/{name}")
    public  Engineer getEngineerName( @PathVariable String name ){
        return service.getEngineerName(name);

    }
    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*****************************************************
    @GetMapping("/get_eng_search_by_id_name/{id}/{name}")
    public  Engineer getEngineerName( @PathVariable Long id , @PathVariable String name ) {
        return service.getEngineerName(id, name);
    }

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*****************************************************
    @GetMapping("/get_eng_search_by_id/{id}")
    public Engineer getEngineer( @PathVariable Long id){
      return service.getEngineerById(id);

    }

    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*****************************************************

    @PutMapping("/update_Eng_db")
    public String updateName(@RequestParam String name, @RequestParam Long id) {
        return service.updateName(name, id);

    }

    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*****************************************************

    @DeleteMapping("/delete_Eng_db/{id}")
    public String delete(@PathVariable Long id) {
        return service.removeById(id);

    }


}
