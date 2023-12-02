package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EngineerRepository extends JpaRepository <Engineer,Long>{


     //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<******************************************>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     public Optional<Engineer> findById(Long id);

   //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<******************************************>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

     public Engineer findByName(String name);

  //<<<<<<<<<<<<<<<<<<<<<<<<<<<<****************************************************>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

  public Engineer findByIdAndName(Long id , String Name);


}