package com.company.animals;

import foods.Food;
import foods.WrongFoodException;

abstract public class Animal {
    public String name;
    public AviarySize size;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(Food food) throws WrongFoodException {
        System.out.println("i ate");
    }

    public void checkHealth () {
        System.out.println(name + " is healthy");
    }
}

