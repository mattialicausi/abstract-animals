package org.exercise.java;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        System.out.println(dog);
        dog.verso();
        dog.eat();

        Passerotto passerotto = new Passerotto("Passerotto");
        System.out.println(passerotto);
        passerotto.verso();
        passerotto.eat();

        Dolphin dolphin = new Dolphin("Dolphin");
        System.out.println(dolphin);
        dolphin.verso();
        dolphin.eat();

        Eagle eagle = new Eagle("Eagle");
        System.out.println(eagle);
        eagle.verso();
        eagle.eat();
    }
}
