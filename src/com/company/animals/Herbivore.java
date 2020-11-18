package com.company.animals;

import foods.Food;
import foods.Herb;
import foods.WrongFoodException;

abstract public class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food.getClass() != new Herb().getClass()) {
            throw new WrongFoodException("can't eat it");
        } else {
            super.eat(food);
        }
    }
}

