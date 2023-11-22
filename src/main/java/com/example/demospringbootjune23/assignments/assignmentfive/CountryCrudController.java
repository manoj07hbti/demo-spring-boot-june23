package com.example.demospringbootjune23.assignments.assignmentfive;

import com.example.demospringbootjune23.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class CountryCrudController {
    ArrayList<Country> countries=new ArrayList<>();
    @RequestMapping("/add_city/{countryName}/{capital}")
    public String addCountryDetails(@PathVariable String countryName, @PathVariable String capital){
        Country country=new Country(countryName,capital);
        countries.add(country);
       return "Added successfully";
    }
@PutMapping("/get_country")
    public ArrayList<Country> getCountry(){

        return countries;
    }
    @PostMapping("/update_country")
    public String updateCountry(@RequestParam String countryName,@RequestParam int index){

        Country country=countries.get(index);
        country.setCountryName(countryName);
        countries.set(index,country);
        return "updated successfully";

    }
    @DeleteMapping("/delete_country")
            public String deleteCountry(int index)
    {
        countries.remove(index);
        return "Deleted successfully";
    }
}
