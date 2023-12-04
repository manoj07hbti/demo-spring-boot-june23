package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Engineer;
import com.example.demospringbootjune23.model.Teacher;
import com.example.demospringbootjune23.repository.EngineerRepository;
import com.example.demospringbootjune23.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class TeacherService {

        @Autowired
        TeacherRepository repository;
        public String add (Teacher teacher) {
                repository.save(teacher);
                return "Successfully Save To Data in Data Base";

        }
        public List<Teacher> getAllTea(){

                return repository.findAll();
        }

        public String updateName( String name, Long id) {
                Teacher teacher = repository.getById(id);
                teacher.setName(name);
                repository.save(teacher);
                return "Successfully Updated Name as " + name;

        }
        public String removeById(Long id) {
                repository.deleteById(id);

                return "Delete Successfully Data from DB";

        }
        //**********************************************************************************************************************


        public Teacher getTeacherById(Long id){
                return repository.findById(id).get();

        }
        //**********************************************************************************************************************


        public  Teacher getTeacherName( @PathVariable String name ) {
                return repository.findByName(name);
        }
        //***************************************************************************************************************************

        public  Teacher getTeacherName(  Long id , String name ) {
                return repository.findByIdAndName(id, name);
        }
        //*******************************************************************************************************************************


        }

