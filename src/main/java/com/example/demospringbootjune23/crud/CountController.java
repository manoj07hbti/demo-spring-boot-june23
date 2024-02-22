package com.example.demospringbootjune23.crud;

import com.example.demospringbootjune23.model.City;
import com.example.demospringbootjune23.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CountController {

    ArrayList<Country> countryArrayList = new ArrayList<>();

    @PostMapping("/add_country")

    public String addCountry(@RequestBody Country country) {

        countryArrayList.add(country);

        return "Country Added";

    }
    // Add

    @PostMapping("/add_countries")

    public String addCount(@RequestParam String countName, @RequestParam String countCap) {

        Country country = new Country(countName, countCap);
        countryArrayList.add(country);
        return "Country Added successfully";
    }

    //Get...
    @GetMapping("/get_all_country")
    public ArrayList<Country> getCountryArrayList() {

        return countryArrayList;
    }
    // Update...

    @PutMapping("/update_country")

    public String updateCountryName(@RequestParam String countName, @RequestParam int index) {

        Country country = countryArrayList.get(index);

        country.setCountName(countName);
        countryArrayList.set(index, country);
        return "country updated successfully";
    }
    // Delete..

    @DeleteMapping("/remove_country")

    public String removeCountryName(@RequestParam int index) {

        countryArrayList.remove(index);

        return "record deleted";

    }

}