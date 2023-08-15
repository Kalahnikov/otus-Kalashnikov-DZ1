package ru.otus.java.basic.dz1.homework6;

public class Plate {
    private int maxFood;
    private int currentFood;

    public int getCurrentFood() {
        return currentFood;
    }

    public void setCurrentFood(int currentFood) {
        this.currentFood = currentFood;
    }

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }


    public void addFood(int amount) {
        currentFood += amount;
        if (currentFood >= maxFood) {
            currentFood = maxFood;
        }
    }

    public boolean decreaseFood(int amount) {
        currentFood -= amount;
        if (currentFood >= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Тарелка с кол-вом еды: " + maxFood;
    }
}
