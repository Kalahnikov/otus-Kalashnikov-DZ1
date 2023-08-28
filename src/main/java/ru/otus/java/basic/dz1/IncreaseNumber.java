package ru.otus.java.basic.dz1;

import java.util.ArrayList;

public class IncreaseNumber {

    public static ArrayList<Integer> increaseNumber(int n, ArrayList<Integer> arrayList){
        for (int i = 0; i<arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i)+n);
        }
        System.out.println(arrayList);
        return arrayList;
    }
}
