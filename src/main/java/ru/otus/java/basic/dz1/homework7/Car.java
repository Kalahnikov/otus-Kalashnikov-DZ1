package ru.otus.java.basic.dz1.homework7;

public class Car implements Movement {
    private int patrol;
    private Terrain[] impassable = {Terrain.FOREST, Terrain.SWAMP};
    private int wastePatrol;

    public Car(int patrol, int wastePatrol) {
        this.patrol = patrol;
        this.wastePatrol = wastePatrol;
    }

    public boolean choosingLocation(Terrain terrain) {
        for (int i = 0; i < impassable.length ; i++) {
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
        if (distance < patrol / wastePatrol) {
            System.out.println("Дистанция пройдена");
            return true;
        } else {
            System.out.println("Дистанция не пройдена");
            return false;
        }
    }

    @Override
    public void sitIn() {
        System.out.println("Человек сел в машину");
    }

    @Override
    public void exit() {
        System.out.println("Человек вышел из машины");
    }
}
