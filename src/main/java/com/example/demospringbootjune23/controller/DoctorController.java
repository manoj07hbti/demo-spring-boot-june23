package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.Model2.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DoctorController {

    ArrayList<Doctor> doctorArrayList=new ArrayList<>();
    @RequestMapping("/Create_Doctor/{name}/{age}/{specialist}")

    public Doctor createDoctor(@PathVariable String name, @PathVariable int age, @PathVariable String specialist){
        return new Doctor(name,age,specialist);
        }
        @RequestMapping("/Create_Doctor_list/{name}/{age}/{specialist}")

        public ArrayList<Doctor> CreateDoctorList(@PathVariable String name,@PathVariable int age, @PathVariable String specialist){
        Doctor doctor=new Doctor(name,age,specialist);
        doctorArrayList.add(doctor);
        return doctorArrayList;
        }
        @RequestMapping("/Update_Doctor")
        public String updateDoctor(@RequestParam String name, @RequestParam int index){

        Doctor doctor=doctorArrayList.get(index);
        doctor.setName(name);
        doctorArrayList.set(index,doctor);
        return "record update successfully";

        }
        @RequestMapping("remove_doctor/{index}")
    public String removeDoctor(@PathVariable int index){
        doctorArrayList.remove(index);
        return "record delete";
        }



    }



