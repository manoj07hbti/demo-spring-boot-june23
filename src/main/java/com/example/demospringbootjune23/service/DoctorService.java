package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.DOCTOR_TABLE;

import com.example.demospringbootjune23.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DoctorService {


    @Autowired
    DoctorRepository repository;


    public String add(DOCTOR_TABLE doctorTable) {

        repository.save(doctorTable);// INSERT INTO TABLE


        return "Successfully saved to DataBase";

    }

    public List<DOCTOR_TABLE> getAllDoctorDataBase() {
        return repository.findAll();//SELECT * FROM TABLE-NAME
    }

    public String removeById(Long id) {
        repository.deleteById(id);//DELETE FROM TABLE WHERE ID=?
        return "Successfully Deleted from DataBase";
    }

    public String updateName(String name, Long id) {

        // step 1: Find the Record which you want to update

        DOCTOR_TABLE doctorTable = repository.getById(id);// find record by id SELECT * FROM TABLE WHERE ID=?

        //step 2: Update the name and save back to DataBase
        doctorTable.setDocName(name);
        repository.save(doctorTable);
        return "Successfully Updated Name as " + name;
    }

}
