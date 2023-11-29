package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Student;
import com.example.demospringbootjune23.repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudRepository studRepository;
    public String addStudent(Student student){
        studRepository.save(student);
        return "student added successfully";


    }
    public List<Student> getAllStudent(){
        return studRepository.findAll();

    }

    public String updateStud(String name,Long id)
    {
       Student student= studRepository.getById(id);
       student.setName(name);
       studRepository.save(student);
        return "updated successful";
    }

    public String removeById( Long id){
        studRepository.deleteById(id);
        return "Deleted successful";

    }
}
