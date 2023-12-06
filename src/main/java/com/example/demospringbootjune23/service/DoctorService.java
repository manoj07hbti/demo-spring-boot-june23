package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Doctor;
import com.example.demospringbootjune23.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository repository;

    public String add(Doctor doctor){
        repository.save(doctor);
        return "doctor data saved in DB";
    }
    public  List<Doctor> getAllDrList(){
        return repository.findAll();
    }

    public String removebyid(Long id){
         repository.deleteById(id);
         return "dr data deleted seccessfully";
    }
    public String update_dr_name(Long id, String name){
        Doctor doctor=repository.getById(id);
        doctor.setName(name);
        repository.save(doctor);
        return "dr name updated successfully as " + name;
    }


}
