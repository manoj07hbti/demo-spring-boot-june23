package com.example.demospringbootjune23.assignments.assignmentfive;

import com.example.demospringbootjune23.model.City;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class CityCrudController {

    ArrayList<City> cities=new ArrayList<>();
@PostMapping("/add_city/{pinCode}/{cityName}")
    public String addCities(@PathVariable int pinCode, @PathVariable String cityName)
    {
        City city=new City(pinCode,cityName);
        cities.add(city);
        return "City added successfully";
    }

@GetMapping("/get_all_cities")
    public ArrayList<City>getCityArrayList()
    {

        return cities;
    }
@PutMapping("/update_City")
    public String updateCity(@RequestParam int pinCode,@RequestParam int index)
    {
        City city=cities.get(index);
        city.setPinCode(pinCode);
        cities.set(index,city);
        return "update successfully";
    }
    @DeleteMapping("/remove_city")
    public String removeCity(int index){
    cities.remove(index);
    return "record deleted successfully";
    }
}
