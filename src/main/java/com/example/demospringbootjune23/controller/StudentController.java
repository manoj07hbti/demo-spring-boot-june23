package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class StudentController {

    ArrayList<Student> studentArrayList= new ArrayList<>();

    //Add

    @RequestMapping("/add_stud/{name}/{age}/{section}")

    public String addStud(@PathVariable String name,@PathVariable int age,@PathVariable String section ){

        Student student= new Student(name,age,section);

        studentArrayList.add(student);

        return "Student Added";

    }

    //Get...

    @RequestMapping("/get_all_stud")

    public ArrayList<Student>getStudentArrayList(){

        return studentArrayList;
    }

    // Update...

    @RequestMapping("/update_stud")

    public String updateStud(@RequestParam String name,@RequestParam int index){

        Student student = studentArrayList.get(index);

        student.setName(name);

        studentArrayList.set(index,student);

        return "Record Update Successfully";

    }

    // Delete....

    @RequestMapping("/remove_stud/{index}")

    public String removeStud(@PathVariable int index){

        studentArrayList.remove(index);
         return "record deleted";

    }

}
