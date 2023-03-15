package org.exercise.java;

public class Dolphin extends Animal{

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Brrr brrr");
    }

    @Override
    public void eat() {
        System.out.println("Pesci ");
    }
}
