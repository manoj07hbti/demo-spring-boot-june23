package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Student;
import com.example.demospringbootjune23.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add_db_stud")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);

    }
    @GetMapping("/get_db_stud")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();

    }
    @PutMapping("/update_db_stud")
    public String updateStud(@RequestParam String name,@RequestParam Long id)
    {
        return studentService.updateStud(name,id);
    }
    @DeleteMapping("/remove_db_stud")
    public String removeById(@RequestParam Long id){
        return studentService.removeById(id);
    }
}
