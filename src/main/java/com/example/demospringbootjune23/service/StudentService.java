package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Student;
import com.example.demospringbootjune23.repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

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
    public Optional<Student> getAllStudentById(Long id){
       return studRepository.findById(id);    }
    public Student getAllStudentByName(String name){
        return studRepository.findByName(name);    }
    public Student getStudentBySection(String section){
        return studRepository.findBySection(section);}
    public Student getAllStudentByNameAndSection(String name,String section){
        return studRepository.findByNameAndSection(name,section) ;  }
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
