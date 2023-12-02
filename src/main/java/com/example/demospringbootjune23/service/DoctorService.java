package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.Model2.DoctorClass;
import com.example.demospringbootjune23.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository repository;

    public String add(DoctorClass doctorClass){
        repository.save(doctorClass);
        return "Successfully insert to db";
    }

    public List<DoctorClass> getAllDoc(){

        return repository.findAll();
    }
    public String removeById(Long id){
        repository.deleteById(id);
        return "successfully delete from database.....";

    }
    public String updateName(String name,Long id){

     DoctorClass doctorClass= repository.getById(id);

     doctorClass.setName(name);

     repository.save(doctorClass);
     return "successfully update name as database....."+name;

    }


}
