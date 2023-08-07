package ru.otus.java.basic.homework5;

public class Animal {
    String name;
    int speedRunning;
    int speedSwimming;
    int stamina;

    public String getName() {
        return name;
    }

    public int getSpeedRunning() {
        return speedRunning;
    }

    public int getSpeedSwimming() {
        return speedSwimming;
    }

    public int getStamina() {
        return stamina;
    }

    public int run(int distance){
        if(distance<=stamina){
            System.out.println("животное, " + name + ", пробежало " + distance + " метров " + " за " + distance/speedRunning + " секунд");
            return distance/speedRunning;
        } else {
            System.out.println("животное, " + name + ", долго бежало, но выносливости на дистанцию не хватило");
            return -1;
        }

    }
    public int swim(int distance){
        if(distance<=stamina){
            System.out.println("животное, " + name + ", проплыло " + distance + " метров " + " за " + distance/speedSwimming + " секунд");
            return distance/speedSwimming;
        } else {
            System.out.println("животное, " + name + ", долго плавало, но выносливости на дистанцию не хватило");
            return -1;
        }
    }

}
