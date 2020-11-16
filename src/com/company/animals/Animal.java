package com.company.animals;

import foods.Food;

abstract public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(Food food) {
        System.out.println("i ate");
    }

    public void checkHealth () {
        System.out.println(name + " is healthy");
    }
}

