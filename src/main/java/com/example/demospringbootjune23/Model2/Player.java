package com.example.demospringbootjune23.Model2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "PLAYER_2023")
public class Player {
    @Id
    @GeneratedValue
    Long id;
    String name;

    String games;

    int id_no;

    public Player() {
    }

    public Player(String name, String games, int id_no) {
        this.name = name;
        this.games = games;
        this.id_no = id_no;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }
}
