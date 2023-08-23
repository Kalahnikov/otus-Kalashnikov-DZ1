package ru.otus.java.basic.dz1.homework7;

public class MoveApplication {
    public static void main(String[] args) {
        Car car = new Car(100, 4);
        Horse horse = new Horse(100, 3);
        Bicycle bicycle = new Bicycle();
        Jeep jeep = new Jeep(1000, 15);
        Human human = new Human("Никита", Terrain.PLAIN);
        Human human1 = new Human("Вася", Terrain.SWAMP);
        Human human2 = new Human("Сема", Terrain.FOREST);
        Human human3 = new Human("Илья", Terrain.SWAMP);

        human.sitInTransport(car);
        human.moveTransport(car, 5);
        human.exitTransport();

        human1.sitInTransport(horse);
        human1.moveTransport(horse, 10);
        human1.exitTransport();

        human2.sitInTransport(bicycle);
        human2.moveTransport(bicycle, 100);
        human2.exitTransport();

        human3.sitInTransport(jeep);
        human3.moveTransport(jeep, 30);
        human3.exitTransport();

    }
}
