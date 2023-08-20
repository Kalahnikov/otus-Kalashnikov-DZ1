package ru.otus.java.basic.homework5.animals;

import ru.otus.java.basic.homework5.animals.Animal;

public class Dog extends Animal{
    public Dog(String name, int speedRunning, int speedSwimming, int stamina){
        this.name = name;
        this.speedRunning = speedRunning;
        this.speedSwimming = speedSwimming;
        this.stamina= stamina;
        super.type = "Собака";
        super.ratio = 2;
    }
}
