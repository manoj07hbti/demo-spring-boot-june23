package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Country;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.ArrayList;

@RestController
public class CountryPostman {
    ArrayList<Country> countryArrayList=new ArrayList<>();

    @PostMapping("/add_country_obj")
    public String addCountry(@RequestBody Country country){
        countryArrayList.add(country);
        return"Country name is added";
    }

    @PostMapping("/add_Country/{name}/{population}")
    public String addCountry(@PathVariable String name,@PathVariable int population){
        Country country = new Country(name,population);
        countryArrayList.add(country);
        return"Country name added successfully";
    }
    @GetMapping("/get_all_Country")
    public ArrayList<Country> getCountryArrayList() {
        return countryArrayList;
    }

    @PutMapping("/update_Country")
    public String updateCountry(@RequestParam String name,@RequestParam int index){
        Country country=countryArrayList.get(index);
        country.setName(name);
        countryArrayList.set(index,country);
        return"Record Is update Successfully";
    }
    @DeleteMapping("/remove_Country/{index}")
    public String removeCountry(@PathVariable int index){
        countryArrayList.remove(index);
        return"Record is Deleted";
    }
}
