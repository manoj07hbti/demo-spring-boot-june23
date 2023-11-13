package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.CountryName;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CountryController {

    ArrayList<CountryName> countryNameArrayList = new ArrayList<>();

    @PostMapping("/post_all_country/{countryName}/{countryState}/{countryPopulation}")
    public String addCountry(@PathVariable String countryName, @PathVariable String countryState, @PathVariable int countryPopulation) {

        CountryName counrty = new CountryName(countryName, countryState, countryPopulation);

        countryNameArrayList.add(counrty);
        return "Country data add successfully";
    }

    @GetMapping("/get_all_country")
    public ArrayList<CountryName> getCountryNameArrayList() {

        return countryNameArrayList;
    }

    @PutMapping("/update_country/{countryName}/{countryState}/{countryPopulation}/{index}")
    public String updateCountry(@PathVariable String countryName, @PathVariable String countryState, @PathVariable int countryPopulation, @PathVariable int index) {

        CountryName country = countryNameArrayList.get(index);
        country.setCountryName(countryName);
        country.setTotalState(countryState);
        country.setCountryPopulation(countryPopulation);
        countryNameArrayList.set(index, country);

        return "update country name successfully";
    }

    @DeleteMapping("/delete_country/{index}")
    public String deleteCountry(@PathVariable int index) {

        countryNameArrayList.remove(index);
        return "Delete data successfully";
    }
}
