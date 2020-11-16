package com.company.animals;

import foods.Food;
import foods.Herb;

abstract public class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (food.getClass() != new Herb().getClass()) {
            System.out.println("can't eat it");
        } else {
            super.eat(food);
        }
    }
}
