package ru.otus.java.basic.dz1;

import java.util.ArrayList;

public class ChangeNumber {


    public ArrayList<Integer> changeNumber(int n, ArrayList<Integer> arrayList){
        for (int i = 0; i<arrayList.size(); i++) {
            arrayList.set(i, n);
        }
        System.out.println(arrayList);
        return arrayList;
    }
}
