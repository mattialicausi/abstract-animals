package org.exercise.java;

public class Main {
    public static void faiVolare(HasFly name) {
     name.fly();
    }
    public static void faiNuotare(HasSwim name) {
        name.swim();
    }
    public static void main(String[] args) {

        Dog dog = new Dog("Dog");
        System.out.println(dog);
        dog.verso();
        dog.eat();
        faiNuotare(dog);


        System.out.println();

        Passerotto passerotto = new Passerotto("Passerotto");
        System.out.println(passerotto);
        passerotto.verso();
        passerotto.eat();
        faiVolare(passerotto);


        System.out.println();

        Dolphin dolphin = new Dolphin("Dolphin");
        System.out.println(dolphin);
        dolphin.verso();
        dolphin.eat();
        faiNuotare(dolphin);


        System.out.println();

        Eagle eagle = new Eagle("Eagle");
        System.out.println(eagle);
        eagle.verso();
        eagle.eat();
        faiVolare(eagle);

    }
}
