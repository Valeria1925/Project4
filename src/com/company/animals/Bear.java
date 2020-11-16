package com.company.animals;

public class Bear extends Carnivorous implements Growble {
    public Bear(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println("Bear is growl");
    }
}
