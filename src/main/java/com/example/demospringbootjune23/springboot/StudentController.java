package com.example.demospringbootjune23.springboot;

import com.example.demospringbootjune23.model_class.Student_Class;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {
    ArrayList<Student_Class> studentClassArrayList = new ArrayList<>();

    @RequestMapping("/add_student/{name}/{age}/{section}")
    public String addStudent(@PathVariable String name, @PathVariable int age, @PathVariable String section) {

        Student_Class student = new Student_Class(name, age, section);

        studentClassArrayList.add(student);
        return "Student data successfully add";
    }

    @RequestMapping("/get_all_student")
    public ArrayList<Student_Class> getStudentClassArrayList() {

        return studentClassArrayList;
    }

    @RequestMapping("/update_student")
    public String updateStudent(@RequestParam String name, @RequestParam int age, @RequestParam String section, @RequestParam int index) {

        Student_Class student = studentClassArrayList.get(index);
        student.setName(name);
        student.setAge(age);
        student.setSection(section);
        studentClassArrayList.set(index, student);
        return "update student successfully";
    }

    @RequestMapping("/remove_student/{index}")
    public String removeStudent(@PathVariable int index) {

        studentClassArrayList.remove(index);

        return "Data deleted successfully";
    }


}
