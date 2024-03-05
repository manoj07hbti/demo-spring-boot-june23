package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Engineer;
import com.example.demospringbootjune23.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EngineerService {

    @Autowired
    EngineerRepository repository;

    public String add(Engineer engineer) {

        repository.save(engineer);

        return "Successfully saved to database";

    }


    public List<Engineer> getAllEngineerDatabase() {

        return repository.findAll();

    }

    public String removeById(Long id) {

        repository.deleteById(id);

        return "Successfully deleted from database";

    }

    public String updateName(String name, Long id) {

        Engineer engineer = repository.getById(id);
        engineer.setEngiName(name);
        repository.save(engineer);

        return "Successfully updated name as" + name;

    }


}



