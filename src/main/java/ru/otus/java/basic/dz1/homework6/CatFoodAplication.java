package ru.otus.java.basic.dz1.homework6;

public class CatFoodAplication {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        System.out.println(plate);
        Cat[] cats = {
                new Cat("Барсик", 15),
                new Cat("Вася", 10),
                new Cat("Кот", 30),
                new Cat("Мурзик", 20),
                new Cat("Фос", 15),
                new Cat("Гелий", 15),
                new Cat("Космос", 20)
        };
        for (Cat Cat : cats) {
            Cat.eat(plate);
            Cat.catInfo();
        }
        System.out.println(plate);
    }
}

