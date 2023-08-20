package ru.otus.java.basic.dz1.homework7;

public class MoveApplication {
    public static void main(String[] args) {
        Car car = new Car(100, 4);
        Horse horse = new Horse(100, 10);
        Bicycle bicycle = new Bicycle();
        Jeep jeep = new Jeep(100, 15);
        Human human = new Human("Никита", car, Terrain.PLAIN);
        Human human1 = new Human("Вася", horse, Terrain.SWAMP);
        Human human2 = new Human("Сема", bicycle, Terrain.FOREST);
        Human human3 = new Human("Илья", jeep, Terrain.SWAMP);

        human.sitInTransport(car);
        human.moveTransport(car, 100);
        human.exitTransport();

        human1.sitInTransport(horse);
        human1.moveTransport(horse, 100);
        human1.exitTransport();

        human2.sitInTransport(bicycle);
        human2.moveTransport(bicycle, 100);
        human2.exitTransport();

        human3.sitInTransport(jeep);
        human3.moveTransport(jeep, 100);
        human3.exitTransport();

    }
}
