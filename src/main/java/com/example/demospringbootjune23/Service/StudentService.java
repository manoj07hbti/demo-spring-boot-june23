package com.example.demospringbootjune23.Service;

import com.example.demospringbootjune23.Model.Student_Table_BD;
import com.example.demospringbootjune23.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public String add(Student_Table_BD Student){
        repository.save(Student);
        return "Successfully save to data base";
    }

    public List<Student_Table_BD> getAllStudent(){
        return repository.findAll();
    }
    public String removedById(Long id){
        repository.deleteById(id);
        return "Successfully deleted data from data base..";
    }
    public String updateName(String name,Long id){
        // Step 1:
       Student_Table_BD student= repository.getById(id);
        // step 2:
        student.setName(name);
        repository.save(student);
        return "Successfully update name as " +name;

    }

    }
