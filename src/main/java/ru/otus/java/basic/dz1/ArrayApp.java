package ru.otus.java.basic.dz1;

public class ArrayApp {

    public static void ArrayFour(String[][] arr) throws AppArraySizeException, AppArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4) {
                    throw new AppArraySizeException();
                }
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("Некоректное значение лежит в ячейке " + i + ", " + j);
                    throw new AppArrayDataException();
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "P"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        try {
            ArrayFour(arr);
        } catch (AppArraySizeException e) {
            System.out.println("Размерность массива не подходит под условие задачи");
        } catch (AppArrayDataException e) {
            System.out.println("Сумма посчитаться не может");
        }
    }
}
