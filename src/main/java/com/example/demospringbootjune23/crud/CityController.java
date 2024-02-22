package com.example.demospringbootjune23.crud;

import com.example.demospringbootjune23.model.City;
import com.example.demospringbootjune23.model.Country;
import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CityController {

    ArrayList<City> cityArrayList = new ArrayList<>();

    @PostMapping("/add_city")

    public String addCity(@RequestBody City city) {

        cityArrayList.add(city);

        return "city Added";

    }
    // Add

    @PostMapping("/add_cities")

    public String addCity(@RequestParam String cityName, @RequestParam int cityPopulation) {

        City city = new City(cityName, cityPopulation);
        cityArrayList.add(city);
        return "city Added successfully";
    }

    //Get...
    @GetMapping("/get_all_city")
    public ArrayList<City> getCityArrayList() {

        return cityArrayList;
    }

    // Update...

    @PutMapping("/update_city")

    public String updateCityName(@RequestParam String cityName, @RequestParam int index) {

        City city = cityArrayList.get(index);

        city.setCityName(cityName);
        cityArrayList.set(index, city);
        return "city updated successfully";
    }
    // Delete..

    @DeleteMapping("/remove_city")

    public String removecityName(@RequestParam int index) {

        cityArrayList.remove(index);

        return "record deleted";

    }

}
