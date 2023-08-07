package ru.otus.java.basic.homework5;

public class Cat extends Animal{
    public Cat(String name, int speedRunning, int stamina) {
        this.name = name;
        this.speedRunning = speedRunning;
        this.stamina = stamina;
    }

    @Override
    public int swim(int distance) {
        System.out.println("Коты не умеют плавать, пусть отдыхают");
        return 0;
    }
}
