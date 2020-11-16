package com.company.animals;

public class Pantera extends Carnivorous implements Runnable {
    public Pantera(String name) {
        super(name);
    }

    @Override
    public void Run() {
        System.out.println("pantera is running");
    }
}
