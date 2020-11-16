package com.company.animals;

import foods.Food;
import foods.Meat;

abstract public class Carnivorous extends Animal {
    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (food.getClass() != new Meat().getClass()) {
            System.out.println("can't eat it");
        } else {
            super.eat(food);
        }
    }
}
