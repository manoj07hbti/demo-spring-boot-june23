package com.example.demospringbootjune23.DemoController;

import com.example.demospringbootjune23.Model.DoctorDataBase;
import com.example.demospringbootjune23.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    DoctorService service;
    @PostMapping("/add_Doctor_DB")
    public String add(@RequestBody DoctorDataBase Doctor){
        return  service.add(Doctor);
    }
    @GetMapping("/get_all_doctor")
    public List<DoctorDataBase> getAllDoctor(){
        return service.getAllDoctor();
    }
    @DeleteMapping("/deleted_Doctor_DB/{id}")
    public String deleted(@PathVariable Long id){
        return service.removeByID(id);
    }
    @PutMapping("/update_Doctor_BD")
    public String updateName(@RequestParam String Name,@RequestParam Long id){
        return service.updateName(Name, id);
    }

}
