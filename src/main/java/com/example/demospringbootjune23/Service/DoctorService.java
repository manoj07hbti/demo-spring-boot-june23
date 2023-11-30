package com.example.demospringbootjune23.Service;

import com.example.demospringbootjune23.Model.DoctorDataBase;
import com.example.demospringbootjune23.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository repository;
    public String add( DoctorDataBase Doctor){
        repository.save(Doctor);
        return "Successfully save to data base";
    }
    public List<DoctorDataBase> getAllDoctor(){
        return repository.findAll();
    }
    public String removeByID(Long id){
        repository.deleteById(id);
        return "Successfully deleted from data base...";
    }
    public String updateName( String Name, Long id){
        DoctorDataBase doctor=repository.getById(id);
        doctor.setName(Name);
        repository.save(doctor);
        return "Successfully update name" +Name;
    }

    }
