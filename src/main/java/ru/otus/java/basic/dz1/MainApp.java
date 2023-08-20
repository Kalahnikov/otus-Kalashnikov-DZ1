package ru.otus.java.basic.dz1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        scannCase();
        greetings();
        checkSign(5, 8, -20);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(7, 3, true);
    }
    public static void greetings() {
        System.out.println("Hallo");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
     /* Можно таким способом, какой в данном случае предпочтительней?
        System.out.println("Hallo\nWorld\nfrom\nJava");
      */
    }
    public static void checkSign(int a, int b, int c) {
        int sum = a+b+c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor(){
        int data = 15;
        if (data <= 10){
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 10;
        int b = 20;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        int result = 0;
        if (increment){
            result = initValue + delta;
        } else {
            result = initValue - delta;
        }
        System.out.println(result);
    }
    public static void scannCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 5 включительно");
        int n = scanner.nextInt();
        switch (n){
            case (1):
                greetings();
                break;
            case (2):
                checkSign((int)Math.random()*100, (int)Math.random()*100, (int)Math.random()*100);
                break;
            case (3):
                selectColor();
                break;
            case (4):
                compareNumbers();
                break;
            case (5):
                addOrSubtractAndPrint((int)Math.random()*100, (int)Math.random()*100, true);
                break;
            default:
                System.out.println("Вы ввели неверное число");
                break;
        }
    }
}

