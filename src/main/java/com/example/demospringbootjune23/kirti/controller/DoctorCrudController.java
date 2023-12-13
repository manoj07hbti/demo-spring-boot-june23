package com.example.demospringbootjune23.kirti.controller;

import com.example.demospringbootjune23.kirti.controller.model.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping
public class DoctorCrudController {
    private List<Doctor> doctorList = new ArrayList<>();

      // Get all doctors;
    @GetMapping("/all_Doctors")
    public List<Doctor> getAllDoctors(){return doctorList;}

      // Get Doctors Name;
    @GetMapping("/doctor/{name}")
    public Doctor getDoctorName(@PathVariable String name){
        for (Doctor doctor: doctorList){
            if (doctor.getName().equals(name)){
                return doctor;
            }
        }
        return null;

    }
      //add new Doctors;
    @PostMapping("/add_Doctor")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        doctorList = new ArrayList<>();
        doctorList.add(doctor);
        return doctor;
    }

    // update Doctors;
    @PutMapping("/update_Doctor/{name}")
    public Doctor updateDoctor(@PathVariable String name,@RequestBody Doctor updateDoctor){
        for (Doctor doctor:doctorList){
            if (doctor.getName().equals(name)){
                doctor.setName(updateDoctor.getName());
                doctor.setSpecialist(updateDoctor.getSpecialist());
                return doctor;
            }
        }
        return null;

    }
     // delete Doctors name;
    @DeleteMapping
    public String deleteDoctor(@PathVariable String name){
        for (Doctor doctor:doctorList){
            if (doctor.getName().equals(name)){
                doctorList.remove(doctor);
                return "Successfully deleted doctors with name. "+name;
            }
        }
        return "No doctor available with name...."+name;
    }

}
