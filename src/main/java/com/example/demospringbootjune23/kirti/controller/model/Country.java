package com.example.demospringbootjune23.kirti.controller.model;

public class Country {
    private Long id;
    private String name;
    private long population;

    public Country() {
    }

    public Country(Long id, String name, long population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}

