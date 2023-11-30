package com.example.demospringbootjune23.DemoController;

import com.example.demospringbootjune23.Model.Student_Table_BD;
import com.example.demospringbootjune23.Repository.StudentRepository;
import com.example.demospringbootjune23.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DBController {
    @Autowired
    StudentService service;
    @PostMapping("/add_Student_DB")
    public String add(@RequestBody Student_Table_BD Student){
        return service.add(Student);
    }
    @GetMapping("/Get_All_Student")
    public List<Student_Table_BD> getAllStudent(){
        return service.getAllStudent();
    }
    @DeleteMapping("/delete_student_db/{id}")
    public String deleted(@PathVariable Long id){
        return service.removedById(id);
    }
    @PutMapping("/update_student_db")
    public String updateName(@RequestParam String name,@RequestParam Long id){
        return service.updateName(name,id);
    }
}
