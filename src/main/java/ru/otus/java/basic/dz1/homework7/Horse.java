package ru.otus.java.basic.dz1.homework7;

public class Horse implements Movement {
    private int power;
    private int wastePower;
    private Terrain[] impassable = {Terrain.SWAMP};

    public Horse(int power, int wastePower) {
        this.power = power;
        this.wastePower = wastePower;
    }

    public boolean choosingLocation(Terrain terrain) {
        for (int i = 0; i < impassable.length; i++) {
            return false;
        }
        return true;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (choosingLocation(terrain)) {
            System.out.println("Дистанция не пройдена");
            return false;
        }
        if (distance > power / wastePower) {
            System.out.println("Дистанция пройдена");
            return true;
        } else {
            System.out.println("Дистанция не пройдена");
            return false;
        }
    }

    @Override
    public void sitIn() {
        System.out.println("Человек сел на лошадь");
    }

    @Override
    public void exit() {
        System.out.println("Человек слез с лошади");
    }
}
