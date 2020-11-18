package com.company.animals;

import foods.Food;
import foods.Meat;
import foods.WrongFoodException;

abstract public class Carnivorous extends Animal {
    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food.getClass() != new Meat().getClass()) {
            throw new WrongFoodException("can't eat it");
        } else {
            super.eat(food);
        }
    }
}
