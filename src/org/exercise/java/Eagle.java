package org.exercise.java;

public class Eagle extends Animal implements HasFly{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Uuu uuu");
    }

    @Override
    public void eat() {
        System.out.println("Carne ");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando ");
    }

}
