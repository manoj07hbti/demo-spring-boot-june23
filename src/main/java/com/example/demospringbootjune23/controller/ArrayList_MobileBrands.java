package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ArrayList_MobileBrands {
    @RequestMapping("/Brands")
    public ArrayList<String> getBrands(){

        ArrayList<String> brands = new ArrayList<>();

        brands.add("Samsung");
        brands.add("Dell");
        brands.add("Vivo");
        brands.add("Appo");
        brands.add("Nokia");
        brands.add("OnePlus");
        brands.add("I Phone");

        return brands;

    }
}
