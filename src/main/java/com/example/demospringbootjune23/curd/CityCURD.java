package com.example.demospringbootjune23.curd;

import com.example.demospringbootjune23.model.City;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;


@RestController
public class  CityCURD {

    ArrayList<City> cityArrayList = new ArrayList<>();

    @PostMapping("/add_city_obj")
    public String addCities(@RequestBody City city) {
        cityArrayList.add(city);
        return "City Added....";
    }

    @PostMapping("/add_city")
    public String addCity(@RequestParam String cityName, @RequestParam double cityPopulation){
        City city=new City(cityName, cityPopulation);
        cityArrayList.add(city);
        return "City Added Successfully....";

    }
   @GetMapping("get_all_cities")
    public ArrayList<City>getCityArrayList(){

        return cityArrayList;
   }
    @PutMapping("update_city")
    public String updateCity(@RequestParam String cityName, @RequestParam int index){
        City city=cityArrayList.get(index);
        city.setCityName(cityName);
        cityArrayList.set(index, city);

        return "City Updated Successfully...." ;
    }

    @DeleteMapping("/remove_city")
    public String removeCity(@RequestParam int index){
        cityArrayList.remove(index);
        return "City Deleted Successfully...";
    }


}
