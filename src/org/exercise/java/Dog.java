package org.exercise.java;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Bau bau ");
    }

    @Override
    public void eat() {
        System.out.println("Croccantini ");
    }
}
