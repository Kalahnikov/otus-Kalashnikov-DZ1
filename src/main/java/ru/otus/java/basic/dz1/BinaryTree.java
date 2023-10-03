package ru.otus.java.basic.dz1;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree implements SearchTree {
    Node root;

    public BinaryTree(ArrayList<Integer> list) {
        this.root = sorted(list);
    }

    public static Node sorted(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return null;
        }
        return tree(list, 0, list.size() - 1);
    }

    private static Node tree(ArrayList<Integer> list, int start, int end) {
        Node node = new Node(0);
        if (start == end - 1) {
            node = new Node(list.get(start));
            node.right = new Node(list.get(start));
        } else if (start == end) {
            return new Node(list.get(start));
        } else {
            int mid = (start + end) / 2;
            node.value = list.get(mid);
            node.left = tree(list, start, mid - 1);
            node.right = tree(list, mid + 1, end);
        }
        return node;
    }

    public static ArrayList getSortedList(ArrayList<Integer> list) {
        return list;
    }

    public boolean find(int element) {
        return find(root, element);
    }

    private boolean find(Node node, int element) {

        if (node.value == element) {
            return true;
        } else if (find(node.left, element)) {
            return true;
        } else if (find(node.right, element)) {
            return true;
        }
        return false;
    }
}
