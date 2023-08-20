package ru.otus.java.basic.dz1.homework7;

public class Human {
    private String name;
    private Movement currentTransport;
    private Terrain terrain;

    public Human(String name, Movement currentTransport, Terrain terrain) {
        this.name = name;
        this.currentTransport = currentTransport;
        this.terrain = terrain;
    }

    public Human(String name) {
        this.name = name;
    }


    public void sitInTransport(Movement currentTransport) {
        if (currentTransport == this.currentTransport) {
            this.currentTransport.sitIn();
        }
    }

    public void exitTransport() {
        this.currentTransport.exit();
    }

    public void moveTransport(Movement currentTransport, int distance) {
        if (currentTransport.equals(this.currentTransport)) {
            currentTransport.move(distance, this.terrain);
        } else {
            System.out.println("Человек прошел расстояние " + distance + " пешком");
        }


    }
}
