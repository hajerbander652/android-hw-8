package com.example.pokemon;

import android.media.Image;

import java.io.Serializable;

public  class pokemon implements Serializable {

    private String name;
    private int Image;
    private int attack;
    private int defence;
    private int total;

    public pokemon(String name, int image, int attack, int defence, int total) {
        this.name = name;
       this.Image = image;
        this.attack = attack;
        this.defence = defence;
        this.total = total;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
