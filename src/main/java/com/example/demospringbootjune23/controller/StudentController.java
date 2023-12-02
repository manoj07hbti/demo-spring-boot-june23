package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Student;
import com.example.demospringbootjune23.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/get_db_stud_by_id/{id}")
    public Optional<Student> getAllStudentById(@PathVariable Long id){
        return studentService.getAllStudentById(id);

    }
    @GetMapping("/get_db_stud_by_name/{name}")
    public Student getAllStudentByName(@PathVariable String name){
        return studentService.getAllStudentByName(name);

    }
    @GetMapping("/get_db_stud_by_section/{section}")
    public Student getAllStudentBySection(@PathVariable String section){
        return studentService.getStudentBySection(section);

    }
    @GetMapping("/get_db_stud_by_name_section/{name}/{section}")
    public Student getAllStudentByNameAndSection(@PathVariable String name,@PathVariable String section){
        return studentService.getAllStudentByNameAndSection(name,section);
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
