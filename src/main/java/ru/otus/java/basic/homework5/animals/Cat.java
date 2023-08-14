package ru.otus.java.basic.homework5.animals;

import ru.otus.java.basic.homework5.animals.Animal;

public class Cat extends Animal {
    public Cat(String name, int speedRunning, int stamina) {
        this.name = name;
        this.speedRunning = speedRunning;
        this.stamina = stamina;
        super.type = "Кот";
    }

    @Override
    public int swim(int distance) {
        System.out.println("Коты не умеют плавать, пусть отдыхают");
        return -1;
    }
}
