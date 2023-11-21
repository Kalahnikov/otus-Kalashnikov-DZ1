package ru.otus.java.basic.dz1;

public class PrintABCApp {
    private class Counter {
        private int value;

        public void inc(){
            value++;
        }

        public void dec(){
            value--;
        }
    }

    private final Object mon = new Object();
    private Counter counter = new Counter();

    public static void main(String[] args) {
        PrintABCApp printABCApp = new PrintABCApp();
        new Thread(()->{
            printABCApp.printA();
        }).start();
        new Thread(()->{
            printABCApp.printB();
        }).start();
        new Thread(()->{
            printABCApp.printC();
        }).start();
    }

    public void printA(){
        synchronized (mon){
            try {
                for (int i = 0; i < 10; i++) {
                    while (counter.value != 0){
                        mon.wait();
                    }
                    System.out.print("A");
                    counter.inc();
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printB(){
        synchronized (mon){
            try {
                for (int i = 0; i < 10; i++) {
                    while (counter.value != 1){
                        mon.wait();
                    }
                    System.out.print("B");
                    counter.inc();
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printC(){
        synchronized (mon){
            try {
                for (int i = 0; i < 10; i++) {
                    while (counter.value != 2){
                        mon.wait();
                    }
                    System.out.print("C");
                    counter.dec();
                    counter.dec();
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
