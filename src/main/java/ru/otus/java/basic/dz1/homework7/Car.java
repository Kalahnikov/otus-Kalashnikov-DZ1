package ru.otus.java.basic.dz1.homework7;

public class Car implements Movement {
    private int patrol;
    private static Terrain[] impassable = {Terrain.FOREST, Terrain.SWAMP};
    private int wastePatrol;

    public Car(int patrol, int wastePatrol) {
        this.patrol = patrol;
        this.wastePatrol = wastePatrol;
    }

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
            System.out.println("Дистанция не пройдена, автомобиль не может пройти по данной местности");
            return false;
        }
        if (distance < patrol / wastePatrol) {
            patrol -= distance * wastePatrol;
            System.out.println("Дистанция пройдена и на нее затрачено " + distance * wastePatrol + " единиц топлива");
            System.out.println("Топлива осталось: " + patrol + " единиц");
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
