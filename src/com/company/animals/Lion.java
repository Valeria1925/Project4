package com.company.animals;

public class Lion extends Carnivorous implements Growble {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println("Bear is growl");
    }
}
