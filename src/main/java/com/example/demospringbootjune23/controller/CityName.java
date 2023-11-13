package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.City;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CityName {
    ArrayList<City> cityArrayList = new ArrayList<>();

    @PostMapping("/post_all_city")
    public String addCity(@RequestBody City city) {
        cityArrayList.add(city);
        return "city add";
    }

    @PostMapping("/post_all_city")
    public String addCity(@RequestParam String cityName, @RequestParam int cityPop, @RequestParam int cityVillage) {

        City city = new City(cityName, cityPop, cityVillage);
        cityArrayList.add(city);

        return "City name add successfully";
    }

    @GetMapping("/get_all_city")
    public ArrayList<City> cityArrayList() {

        return cityArrayList;
    }

    @PutMapping("/put_city")
    public String updateCity(String cityName, int cityPop, int cityVillage, int index) {
        City city = cityArrayList.get(index);
        city.setCityName(cityName);
        city.setCityPop(cityPop);
        city.setCityVillage(cityVillage);
        cityArrayList.set(index, city);
        return "update city data successfully";
    }

    @DeleteMapping("/delete_city")
    public String removeCity(int index) {

        cityArrayList.remove(index);
        return "remove city data successfully";
    }
}


