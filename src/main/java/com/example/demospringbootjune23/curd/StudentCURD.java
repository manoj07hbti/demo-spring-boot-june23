package com.example.demospringbootjune23.curd;

import com.example.demospringbootjune23.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentCURD {


    ArrayList<Student> studentArrayList = new ArrayList<>();


    @PostMapping("/add_stud_obj")
    public String addStudents(@RequestBody Student student) {
        studentArrayList.add(student);

        return "Student added...";
    }


    @PostMapping("/add_stud/{name}/{age}/{section}")
    public String addStud(@PathVariable String name, @PathVariable int age, @PathVariable String section) {
        Student student = new Student(name, age, section);
        studentArrayList.add(student);
        return "Student Added Successfully...";
    }

    @GetMapping("/get_all_stud")
    public ArrayList<Student> getStudentArrayList() {

        return studentArrayList;
    }

    @PutMapping("/update_stud")
    public String updateStud(@RequestParam String name, @RequestParam int index) {
        //get student object
        Student stud = studentArrayList.get(index);//
        stud.setName(name);
        studentArrayList.set(index, stud);
        return "Record update_successfully...";
    }

    @DeleteMapping("remove_stud/{index}")
    public String removeStud(@PathVariable int index) {
        studentArrayList.remove(index);
        return "record_deleted..";
    }


}
