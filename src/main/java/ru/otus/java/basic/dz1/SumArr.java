package ru.otus.java.basic.dz1;

import java.util.ArrayList;

public class SumArr {

    public int sumArr(ArrayList<Integer> arrayList){
        int sum = 0;
        for (int i: arrayList) {
            if(i>5){
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
