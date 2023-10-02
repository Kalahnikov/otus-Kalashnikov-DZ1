package ru.otus.java.basic.dz1;

public class MathCalculation {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        double[] arr = new double[100_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        System.out.println(System.currentTimeMillis() - t);
    }
}
