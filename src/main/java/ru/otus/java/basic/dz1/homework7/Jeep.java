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
        if (distance < patrol / wastePatrol) {
            patrol -= distance * wastePatrol;
            System.out.println("Дистанция пройдена и на нее затрачено " + distance * wastePatrol + " единиц топлива");
            System.out.println("Топлива осталось: " + patrol + " единиц");
            return true;
        } else {
            System.out.println("Дистанция не пройдена, топлива не хватило");
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
