package ru.otus.java.basic.dz1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MainNode {
    public static void main(String[] args) {
        List<Integer> source = IntStream.range(1, 20).boxed().toList();

        BinaryTree tree = new BinaryTree(new ArrayList<>(source));

        System.out.println(tree.find(10));
        System.out.println(tree.find(20));
        System.out.println(tree.find(30));
    }
}
