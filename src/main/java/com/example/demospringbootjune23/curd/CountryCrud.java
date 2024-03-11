package com.example.demospringbootjune23.curd;

import com.example.demospringbootjune23.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CountryCrud {

    ArrayList<Country> countryArrayList = new ArrayList<>();

    @PostMapping("/add_country_obj")
    public String addCountry(@RequestBody Country country) {
        countryArrayList.add(country);
        return "Country Added Successfully";

    }

    @PostMapping("/add_country")
    public String addCountry(@RequestParam String countryName, @RequestParam String countryOrigin, @RequestParam int population) {
        Country country = new Country(countryName, countryOrigin, population);
        countryArrayList.add(country);
        return "Country Added Successfully";

    }

    @GetMapping("/get_all_countries")
    public ArrayList<Country> getCountryArrayList() {
        return countryArrayList;
    }


    @PutMapping("/update_country")
    public String updateCountry(@RequestParam String countryName, @RequestParam int index) {
        Country country = countryArrayList.get(index);
        country.setCountryName(countryName);
        countryArrayList.set(index, country);
        return "Country Updated Successfully";


    }

    @DeleteMapping("/delete_country")
    public String deleteCountry(@RequestParam int index) {
        countryArrayList.remove(index);
        return "Country Removed Successfully";
    }


}
