package com.company.animals;

public class Duck extends Carnivorous implements Quackable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void Quack() {
        System.out.println("Duck is quack");
    }
}
