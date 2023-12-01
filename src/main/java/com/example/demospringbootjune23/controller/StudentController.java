package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class StudentController {

    ArrayList<Student> studentArrayList = new ArrayList<>();

    @RequestMapping("/add_std/{name}/{age}/{section}")
    public String addStd(@PathVariable String name, @PathVariable int age, @PathVariable String section) {
        Student student = new Student(name, age, section);
        studentArrayList.add(student);
        return "Student Added Successfully...";
        //http://localhost:8080/add_std/Aswhin/23/D
    }

    @RequestMapping("/get_all_std")
    public ArrayList<Student> getStudentArrayList(){
        return studentArrayList;
    }
    //http://localhost:8080/get_all_std

    @RequestMapping("/update_std")
    public String updateStd(@RequestParam String name,@RequestParam int index){
        Student std= studentArrayList.get(index);
        std.setName(name);
       studentArrayList.set(index,std);
        return"Student record is updated successfully";
        // you can use void instead od string
        //http://localhost:8080/update_std?name=Rajul%20Tony%20Roy&index=2
    }
    @RequestMapping("remove_std/{index}")
    public String removeStd(@PathVariable int index){
        studentArrayList.remove(index);
        return"record_deleted";
        //http://localhost:8080/remove_std/2
    }
}

