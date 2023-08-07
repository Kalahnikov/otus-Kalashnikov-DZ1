package ru.otus.java.basic.homework5;

public class Hourse extends Animal {
    public Hourse(String name, int speedRunning, int speedSwimming, int stamina) {
        this.name = name;
        this.speedRunning = speedRunning;
        this.speedSwimming = speedSwimming;
        this.stamina = stamina;
    }

    @Override
    public int swim(int distance) {
        if (distance <= (stamina/4)){
            System.out.println("лошадь, " + name + ", проплыла " + distance + " метров " + " за " + distance / speedSwimming + " секунд");
            return distance / (speedSwimming*4);
        } else {
            System.out.println("лошадь, " + name + ", долго плавала, но выносливости на дистанцию не хватило");
            return -1;
        }
    }
}
