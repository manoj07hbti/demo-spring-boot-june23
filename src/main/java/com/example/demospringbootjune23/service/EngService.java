package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Engineer;
import com.example.demospringbootjune23.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class EngService {
    @Autowired
    EngineerRepository repository;

    public String add(Engineer engineer){
        repository.save(engineer);

        return "Successfully Save to Db.....";
//**********************************************************************************************************************

    }
    public Engineer getEngineerById(Long id){
      return repository.findById(id).get();

    }
    //**********************************************************************************************************************


    public  Engineer getEngineerName( @PathVariable String name ) {
        return repository.findByName(name);
    }
   //***************************************************************************************************************************

    public  Engineer getEngineerName(  Long id , String name ) {
        return repository.findByIdAndName(id, name);
    }
    //*******************************************************************************************************************************


    public List<Engineer> getEngineer(){
     return  repository.findAll();
    }

    //********************************************************************************************************************

    public String removeById(Long id){
        repository.deleteById(id);

        return "Delete Successfully Data from DB";
    }

    //***********************************************************************************************************************
    public String updateName( String name, Long id) {
        Engineer engineer = repository.getById(id);
        engineer.setName(name);
        repository.save(engineer);
        return "Successfully Updated Name as "+ name;

    }


    }



