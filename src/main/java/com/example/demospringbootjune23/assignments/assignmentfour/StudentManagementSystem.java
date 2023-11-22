package com.example.demospringbootjune23.assignments.assignmentfour;

import com.example.demospringbootjune23.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentManagementSystem {
    ArrayList<Student> studentArrayList=new ArrayList<>();
    @PostMapping("/add_stud")
    public String addStudent(@RequestParam String name, @RequestParam int age,@RequestParam String section){
        Student student=new Student(name, age, section);
        studentArrayList.add(student);
     return "Student added successfully..."  ;
    }
    @GetMapping("/get_stud")

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }
@PutMapping("/update_stud")
    public String updateStudent(@RequestParam String section,@RequestParam int index)
    {
        Student stud=studentArrayList.get(index);
        stud.setSection(section);
        studentArrayList.set(index,stud);
        return "Student updated successfully...";
    }
    @DeleteMapping("/delete_stud")
    public String deleteStudent(@RequestParam int index){
        studentArrayList.remove(index);
        return "Student deleted successfully...";

    }
}
