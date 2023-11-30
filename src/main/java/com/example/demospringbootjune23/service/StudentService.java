package com.example.demospringbootjune23.service;



import com.example.demospringbootjune23.model.Student;
import com.example.demospringbootjune23.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    StudentRepository repository;
    public String add(Student student){

       repository.save(student);
       return "Successfully saved to DataBase";// INSERT INTO TABLE
    }

    //READ
    @GetMapping("/get_all_dataBase_emp")
    public List<Student> getAllStudentDataBase() {

        return repository.findAll();//SELECT * FROM TABLE-NAME
    }

    public String removeById(Integer rollNo) {
        repository.deleteById(rollNo);//DELETE FROM TABLE WHERE ID=?
        return "Successfully Deleted from DataBase";
    }

    public String updateName(String name, Integer rollNo) {

        // step 1: Find the Record which you want to update

        Student student = repository.getById(rollNo);// find record by id SELECT * FROM TABLE WHERE ID=?

        //step 2: Update the name and save back to DataBase
        student.setName(name);
        repository.save(student);
        return "Successfully Updated Name as " + name;
    }

}
