package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.Model2.Student;
import com.example.demospringbootjune23.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


@Autowired
    StudentRepository repository;

    public String add(Student student){
        repository.save(student);

        return "Successfully saved to db........";

    }
    public List<Student> getAllStu(){

        return repository.findAll(); //select * from table
    }
    public String removeById(Long id){
        repository.deleteById(id);
        return "successfully deleted data from db.....";

    }

    public String updateName(String name,Long id){
      Student student=repository.getById(id);

      student.setName(name);
      repository.save(student);

      return "successfully return the name "+name;
    }
}
