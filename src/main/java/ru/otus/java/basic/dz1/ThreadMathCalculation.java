package ru.otus.java.basic.dz1;

public class ThreadMathCalculation {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        double[] arr = new double[100_000_000];
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arr.length * (1 / 4); i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = arr.length * (1 / 4) + 1; i < arr.length * (2 / 4); i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = arr.length * (1 / 2) + 1; i < arr.length * (3 / 4); i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = arr.length * (3 / 4) + 1; i < arr.length; i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println(System.currentTimeMillis() - t);
    }
}
