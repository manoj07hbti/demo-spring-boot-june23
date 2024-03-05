package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Boeing;
import com.example.demospringbootjune23.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaneService {

    @Autowired
    PlaneRepository repository;

    public String add(Boeing boeing) {

        repository.save(boeing);

        return "Successfully Added to System";

    }

    public List<Boeing> getAllPlane() {

        return repository.findAll();

    }

    public Optional<Boeing> getPlaneById(Long id) {

        return repository.findById(id);

    }

    public String updatePlaneName(String planeName, Long id) {

        Boeing boeing = repository.getById(id);

        boeing.setPlaneName(planeName);

        repository.save(boeing);

        return "Successfully Updated";

    }

    public String deleteById(Long id) {

        repository.deleteById(id);

        return "Successfully deleted";


    }

}
