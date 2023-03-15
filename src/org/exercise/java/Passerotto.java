package org.exercise.java;

public class Passerotto extends Animal implements HasFly{

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

    @Override
    public void fly() {
        System.out.println("Sto volando ");
    }

}
