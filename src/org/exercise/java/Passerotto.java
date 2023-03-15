package org.exercise.java;

public class Passerotto extends Animal{

    public Passerotto(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Cip cip ");
    }

    @Override
    public void eat() {
        System.out.println("Erba ");
    }
}
