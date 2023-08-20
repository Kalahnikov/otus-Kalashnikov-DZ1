package ru.otus.java.basic.homework5.animals;

public class Horse extends Animal {
    String type = "Лошадь";
    int ratio = 4;

    public Horse(String name, int speedRunning, int speedSwimming, int stamina) {
        this.name = name;
        this.speedRunning = speedRunning;
        this.speedSwimming = speedSwimming;
        this.stamina = stamina;
        super.type = "Лошадь";
        super.ratio = 4;
    }

}
