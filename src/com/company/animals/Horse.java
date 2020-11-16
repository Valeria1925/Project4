package com.company.animals;

public class Horse extends Herbivore implements Runnable {
    public Horse(String name) {
        super(name);
    }

    @Override
    public void Run() {
        System.out.println("Horse is running");
    }
}
