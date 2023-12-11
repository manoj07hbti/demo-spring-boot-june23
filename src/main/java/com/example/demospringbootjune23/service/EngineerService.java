package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Engineer;
import com.example.demospringbootjune23.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineerService {
    // autowired from repository
    @Autowired
    EngineerRepository repository;

    public String add(Engineer engineer){
        repository.save(engineer);
        return "eng.. added successfully";
    }
    public List<Engineer> getEnggList(){
        return repository.findAll();
    }
    public String updateEngg(long id, String name){
        Engineer engineer=repository.getReferenceById(id);
        engineer.setName(name);
        repository.save(engineer);
        return "name updated successfully as " +name;
    }
    public String remove(long id){
        repository.deleteById(id);
        return "engg data deleted successfully";
    }
//  public Engineer deleteByName(String name){
//      repository.deleteByName(name);
//      return "Engg data deleted by name successfully";
//  }
    public Engineer getByName(String name){
        return repository.findByName(name);
    }
    public Engineer getBySalary(int salary){
        return repository.findBySalary(salary);
    }
    // native logics
    public List<Engineer> getAllEnggList(){
        return repository.getAllEnggNative();
    }
    public Engineer getEnggByNameNative(String name){
        return repository.getEnggNameNative(name);
    }
    public Engineer getEnggByNameAndCompanyNative(String name,String company){
        return repository.getEnggNameAndCompanyNative(name,company);
    }
//    public Long deletebyrangeNative(Long start,Long end){
//        return repository.deletByRange(start,end);
//    }
}
