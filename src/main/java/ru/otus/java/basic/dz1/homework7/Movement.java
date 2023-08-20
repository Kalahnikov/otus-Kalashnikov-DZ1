package ru.otus.java.basic.dz1.homework7;

public interface Movement {
    boolean move(int distance, Terrain terrain);

    void sitIn();

    void exit();
}
