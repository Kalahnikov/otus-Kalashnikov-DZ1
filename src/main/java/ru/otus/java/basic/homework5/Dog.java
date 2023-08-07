package ru.otus.java.basic.homework5;

public class Dog extends Animal{
    public Dog(String name, int speedRunning, int speedSwimming, int stamina){
        this.name = name;
        this.speedRunning = speedRunning;
        this.speedSwimming = speedSwimming;
        this.stamina= stamina;
    }

    @Override
    public int swim(int distance) {
        if (distance <= (stamina/2)){
            System.out.println("собака, " + name + ", проплыла " + distance + " метров " + " за " + distance / speedSwimming + " секунд");
            return distance / (speedSwimming*2);
        } else {
            System.out.println("собака, " + name + ", долго плавала, но выносливости на дистанцию не хватило");
            return -1;
        }
    }
}
