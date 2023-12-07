package com.example.demospringbootjune23.kirti.controller;

import com.example.demospringbootjune23.kirti.controller.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class CountryCrudController {
    private List<Country> countryList = new ArrayList<>();

    // Get all countries
    @GetMapping("/all-countries")
    public List<Country> getAllCountries() {
        return countryList;
    }

    // Get a specific country by ID
    @GetMapping("/country/{id}")
    public Country getCountryById(@PathVariable Long id) {
        for (Country country : countryList) {
            if (country.getId().equals(id)) {
                return country;
            }
        }
        return null;
    }

    // Add a new country
    @PostMapping("/add-country")
    public Country addCountry(@RequestBody Country country) {
            countryList.add(country);
            return country;
    }

    // Update an existing country
    @PutMapping("/update-country/{id}")
    public Country updateCountry(@PathVariable Long id, @RequestBody Country updatedCountry) {
        for (Country country : countryList) {
            if (country.getId().equals(id)) {
                country.setName(updatedCountry.getName());
                country.setPopulation(updatedCountry.getPopulation());
                return country;
            }
        }
        return null;
    }

    // Delete a country by ID
    @DeleteMapping("/delete-country/{id}")
    public String deleteCountry(@PathVariable Long id) {
        for (Country country : countryList) {
            if (country.getId().equals(id)) {
                countryList.remove(country);
                return "Successfully deleted country with id: " + id;
            }
        }
        return "No country available with id: " + id;
    }
}
