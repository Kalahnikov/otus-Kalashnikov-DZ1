package ru.otus.java.basic.dz1.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        plate.setCurrentFood(plate.getCurrentFood() - appetite);
        if (plate.getCurrentFood() > 0) {
            System.out.println(name + " съел " + appetite + " единиц корма");
            satiety = true;
        } else {
            System.out.println(name + " не смог поесть, ему не хватило еды");
        }
    }
    public void catInfo(){
        if (satiety) {
            System.out.println("Кот " + name + " сытый");
        } else {
            System.out.println("Кот " + name + " голодный");
        }
    }

    @Override
    public String toString() {
        return "Кот: " + name + " с аппетитом " + appetite;
    }
}
