package ru.otus.java.basic.homework4;

public class Box {
    private int width;
    private int height;
    private int lenght;
    private String color;
    boolean isOpen;
    String object;

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLenght() {
        return lenght;
    }

    public void info() {
        System.out.println("Size: width - " + width + "height - " + height + "lenght - " + lenght + "color - " + color);
    }

    public void open() {
        if (isOpen) {
            System.out.println("Коробка открыта");
        }
    }

    public void close() {
        if (!isOpen) {
            System.out.println("Коробка закрыта");
        }
    }

    public void putObject(String obj) {
        if (!isOpen) {
            System.out.println("Коробка закрыта, чтобы положить в нее предмет, необходимо ее открыть");
            return;
        }
        if (this.object != null) {
            System.out.println("В коробке уже есть предмет");
            return;
        }
        this.object = obj;
        System.out.println("Предмет " + obj + "успешно положили в коробку");
    }
}
