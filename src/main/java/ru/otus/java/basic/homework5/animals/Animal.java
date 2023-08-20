package ru.otus.java.basic.homework5.animals;

public class Animal {
    String name;
    int speedRunning;
    int speedSwimming;
    int stamina;
    String type;
    int ratio;

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

    public int run(int distance) {
        if (distance <= stamina) {
            System.out.println(type + " " + name + ", пробежал " + distance + " метров " + " за " + distance / speedRunning + " секунд");
            return distance / speedRunning;
        } else {
            System.out.println(type + " " + name + ", долго бежал, но выносливости на дистанцию не хватило");
            return -1;
        }

    }

    public int swim(int distance) {
        if (distance <= (stamina / ratio)) {
            System.out.println(type + " " + name + ", проплыл " + distance + " метров " + " за " + distance / speedSwimming + " секунд");
            return distance / (speedSwimming * ratio);
        } else {
            System.out.println(type + " " + name + ", долго плавал, но выносливости на дистанцию не хватило");
            return -1;
        }
    }

}
