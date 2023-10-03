package ru.otus.java.basic.dz1;

public class Node <Integer> {
    int value;
    Node left;
    Node right;

    Node (int value){
        this.value = value;
        right = null;
        left = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
