package ru.otus.java.basic.dz1.homework7;

public class Jeep implements Movement {
    private int patrol;
    private int wastePatrol;

    public Jeep(int patrol, int wastePatrol) {
        this.patrol = patrol;
        this.wastePatrol = wastePatrol;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (distance > patrol / wastePatrol) {
            System.out.println("Дистанция пройдена");
            return true;
        } else {
            System.out.println("Дистанция не пройдена");
            return false;
        }
    }

    @Override
    public void sitIn() {
        System.out.println("Человек сел в Вездеход");
    }

    @Override
    public void exit() {
        System.out.println("Человек вышел из Вездехода");
    }
}
