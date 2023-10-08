package ru.otus.java.basic.dz1;

public class ThreadMathCalculation {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        double[] arr = new double[100_000_000];


        for (int i = 0; i < 4; i++) {
            int inc = i;
            Thread ti = new Thread(() -> {

                for (int j = 0; j < arr.length; j += inc) {
                    arr[j] = 1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2);
                }
            });
            ti.start();
        }
        System.out.println(System.currentTimeMillis() - t);
    }
}
