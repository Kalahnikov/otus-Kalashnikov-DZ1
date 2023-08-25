package ru.otus.java.basic.dz1.homework7;

public class Bicycle implements Movement {
    private static Terrain[] impassable = {Terrain.SWAMP};

    public boolean isLocationPassable(Terrain terrain) {
        for (int i = 0; i < impassable.length; i++) {
            if (impassable[i].equals(terrain)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (isLocationPassable(terrain)) {
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
