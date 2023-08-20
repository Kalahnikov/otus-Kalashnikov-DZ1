package ru.otus.java.basic.dz1.homework7;

public class Bicycle implements Movement {
    private Terrain[] impassable = {Terrain.SWAMP};

    public boolean choosingLocation(Terrain terrain) {
        for (int i = 0; i < impassable.length; i++) {
            return false;
        }
        return true;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (choosingLocation(terrain)) {
            System.out.println("Дистанция пройдена");
            return true;
        } else {
            System.out.println("Дистанция не пройдена");
            return false;
        }
    }

    @Override
    public void sitIn() {
        System.out.println("Человек сел на велосипед");
    }

    @Override
    public void exit() {
        System.out.println("Человек слез с велосипеда");
    }
}
