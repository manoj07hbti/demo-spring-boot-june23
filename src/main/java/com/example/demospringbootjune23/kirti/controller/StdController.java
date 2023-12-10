package com.example.demospringbootjune23.kirti.controller;

import com.example.demospringbootjune23.kirti.controller.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StdController {

    ArrayList<Student> studentArrayList = new ArrayList<>();

    @RequestMapping("/add_Std/{name}/{age}/{section}")
    public Student addStd(@PathVariable String name,@PathVariable int age ,@PathVariable String section ){

        Student student = new Student( name,age,section);

        studentArrayList.add(student);

        return student;
    }

    @RequestMapping("/add_all_Student")

    public ArrayList<Student> getStudentArrayList(){
        studentArrayList.add(new Student("Rohan",23 ,"A"));
        studentArrayList.add(new Student("Rahul",24 ,"B"));
        studentArrayList.add(new Student("Pankaj",25 ,"C"));
        studentArrayList.add(new Student("Kiran",26 ,"D"));

        return studentArrayList;
    }
    @RequestMapping("/update_std")
    public String updateStd(@RequestParam String name,@RequestParam int index){

        // get students object

       Student std = studentArrayList.get(index);//updated
        std.setName(name);
        studentArrayList.set(index,std);
        return "Students update_record successfully";
    }
    @RequestMapping("remove_std/{index}")
    public String removeStd(@PathVariable int index){
        studentArrayList.remove(index);
        return "Record deleted";
    }
}
