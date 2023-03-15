package org.exercise.java;

public class Dolphin extends Animal implements HasSwim{

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

    @Override
    public void swim() {
        System.out.println("Sto nuotando ");
    }

}
