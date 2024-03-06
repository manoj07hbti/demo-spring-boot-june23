package com.example.demospringbootjune23.kirti.controller;

import com.example.demospringbootjune23.kirti.controller.model.City;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping
public class CityCrudController {
    private List<City> cityList = new ArrayList<>();

    // Get all cities;
    @GetMapping("/all_cities")
    public List<City>getAllCities(){return cityList;}

    // Get a city by name;
    @GetMapping("/cities/{name}")
    public City getCityByName(String name){
        for (City city: cityList){
            if (city.getName().equals(name)) {
                return city;
            }
        }
        return null;
    }

    // Add a new city
    @PostMapping("/add-city")
    public City addCity(@RequestBody  City city) {
        cityList.add(city);
        return city;
    }

    // Update an existing city;
    @PutMapping("/update-city/{name}")
    public City updateCity(@PathVariable String name, @RequestBody City updatedcity) {
        for (City city : cityList) {
            if (city.getName().equals(name)) {
                city.setName(updatedcity.getName());
                city.setHospitals(updatedcity.getHospitals());
                return city;
            }
        }
        return null;
    }

    // Delete a city by Name
    @DeleteMapping("/delete-city/{name}")
    public String deleteCity(@PathVariable String name) {
        for (City city: cityList) {
            if (city.getName().equals(name)) {
                cityList.remove(city);
                return "Successfully deleted city with name: " + name;
            }
        }
        return "No city available with name : " + name;



        }
    }

