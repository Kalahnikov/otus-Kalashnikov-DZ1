package DZ3;

import java.util.Arrays;

public class dz3 {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 6, 7, 4}, {3, 4, 6, 7, 8}, {2, 7, 5, 3, 1}, {4, 5, 7, 1, 2}, {3, 4, 7, 1, 3}};
        sumOfPositiveElements(new int[][]{{2, -3, 6, 7, -4}, {3, -4, 6, -7, 8}, {2, -7, 5, 3, -1}, {4, -5, 7, 1, -2}});
        printSquare(10);
        printZeroDiagonal(arr);
        findMax(new int[][]{{2, -3, 6, 7, -4}, {3, -4, 6, -7, 8}, {2, -7, 5, 8, -1}, {4, -5, 7, 1, -2}});
        sumSecondLine(new int[][]{{1, 1, 1, 1, 1}, {3, 4, 6, 7, 8}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}});
    }

    public static void sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // Не совсем понял задание. Если необходим закрашеный квадрат, то:
        /*
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         */
    }

    public static void printZeroDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i - j) == 0) {
                    arr[i][j] = 0;
                } else if (arr.length - j - i - 1 == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }

    public static void sumSecondLine(int[][] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (arr.length >= 2) {
                sum += arr[1][i];
            } else {
                System.out.println("-1");
            }
        }
        System.out.println(sum);
    }
}

