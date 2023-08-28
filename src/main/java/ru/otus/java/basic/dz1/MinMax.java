package ru.otus.java.basic.dz1;

import java.util.ArrayList;

public class MinMax {

    public ArrayList<Integer> minMax(int min, int max){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = min; i <= max ; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        return arrayList;
    }
}
