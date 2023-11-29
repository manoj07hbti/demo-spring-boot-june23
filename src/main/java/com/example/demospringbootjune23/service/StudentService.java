package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Student;
import com.example.demospringbootjune23.repositroy.StudentReositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentReositroy reositroy;

    public String add(Student student) {
        reositroy.save(student);
        return "Successfully save to data base";
    }

    public List<Student> getAllStu() {

        return reositroy.findAll();
    }

    public String updateName(String name, Long ID) {

        Student student = reositroy.getById(ID);
        student.setName(name);
        reositroy.save(student);
        return "Successfully updated name in data base as" + name;

    }

    public String removeByID(Long ID) {

        reositroy.deleteById(ID);
        return "Successfully data deleted from data base";
    }

}
