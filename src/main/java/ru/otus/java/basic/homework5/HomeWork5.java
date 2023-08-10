package ru.otus.java.basic.homework5;

public class HomeWork5 {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 7, 25);
        Hourse hourse = new Hourse("Марс", 15, 2, 60);
        Dog dog = new Dog("Пес", 10, 3, 40);
        cat.run(75);
        cat.swim(12);
        dog.run(20);
        dog.swim(15);
        hourse.run(55);
        hourse.swim(16);
    }
}
