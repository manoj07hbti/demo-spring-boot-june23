package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Doctor_ArrayList {

    //******** ADD AND READ DATA *******************************
    ArrayList<Doctor> doctorArrayList = new ArrayList<>();
    @RequestMapping("/add_doctor/{name}/{age}/{specialist}")
    public String addDoctor(@PathVariable String name, @PathVariable int age,@PathVariable String specialist){

        Doctor doctor = new Doctor(name,age,specialist);
        doctorArrayList.add(doctor);
        return "Added Doctor Successfully";

    }
    @RequestMapping("/get_Doctor")
    public ArrayList<Doctor> getDoctorArrayList(){

        return doctorArrayList;
    }
    //****************** UPDATE AND REMOVE ****************************
    @RequestMapping("/update_doc")
    public String updateDoc(@PathVariable String name, @PathVariable int index){
        Doctor doctor = doctorArrayList.get(index);
        doctor.setName(name);
        doctorArrayList.set(index,doctor);
       return "Record Update Successfully";

    }
    @RequestMapping("/remove_doc/{index}")
    public String removeDoc(@PathVariable int index){
        doctorArrayList.remove(index);
        return "Record Deleted";

    }



}
