package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.City;
import com.example.demospringbootjune23.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController

public class CityPostman {
   ArrayList<City> cityArrayList= new ArrayList<>();
   @PostMapping("/add_city_obj")
   public String addCity(@RequestBody City city){
        cityArrayList.add(city);
        return"City name is added";
    }
    @PostMapping("/add_city/{name}/{state}/{population}")
    public String addCity(@PathVariable String name,@PathVariable String state,@PathVariable int population){
        City city= new City(name, state,population);
        return"City data Added Successfully";
    }
    @GetMapping("/get_all_city")
    public ArrayList<City> getCityArrayList(){
        return cityArrayList;
    }
    @PutMapping("/update_city")
    public String updateCity(@RequestParam String name, @RequestParam int index){
        City city = cityArrayList.get(index);
        city.setCityName(name);
        cityArrayList.set(index,city);
        return"Record is updated Successfully";
    }
    @DeleteMapping("/remove_city/{index}")
    public String removeCity(@PathVariable int index){
        cityArrayList.remove(index);
        return"Record is Deleted";
    }

}
