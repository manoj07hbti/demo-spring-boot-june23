package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Doctor;
import com.example.demospringbootjune23.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository repository;
    public String add(Doctor doctor){
        repository.save(doctor);
    return" Successfully add in db";
    }

    public List<Doctor> getAllDr(){
        return repository.findAll();
    }

    public String removeById(Long id) {
        repository.deleteById(id);
        return "Successfully deleted data from DB";
    }

    public String updateName( String name, Long id){
        //Step 1:- FIND THE RECORD WHICH YOU WANT TO UPDATE
        Doctor  doctor = repository.getById(id);//FIND THE RECORD BY ID SELECT * FROM THE TABLE Eg- 22
        // Step2:- UPDATE THE NAME SAVE BACK TON DB
        doctor.setName(name);//CHANGE THE NAME
        repository.save(doctor);
        return "Successfully update as the name" +name;
    }
}

