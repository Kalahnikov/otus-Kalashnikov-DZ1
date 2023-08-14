package ru.otus.java.basic.homework5;

import ru.otus.java.basic.homework5.animals.Cat;
import ru.otus.java.basic.homework5.animals.Dog;
import ru.otus.java.basic.homework5.animals.Horse;

public class HomeWork5 {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 7, 25);
        Horse horse = new Horse("Марс", 15, 2, 60);
        Dog dog = new Dog("Пес", 10, 3, 40);
        cat.run(75);
        cat.swim(12);
        dog.run(20);
        dog.swim(15);
        horse.run(55);
        horse.swim(16);
    }
}
