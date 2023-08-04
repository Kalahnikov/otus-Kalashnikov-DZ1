package homework2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 6, 7};
        int[] arr1 = {1, 7, 4, 6, 7};
        printStr(5, "Hallo");
        sumArr(new int[]{1, 5, 7, 9, 9});
        fillArr(5, arr);
        addNum(5, arr1);
        compareSum(1, 2, 5, 4, 7);
        sumArray(new int[]{1, 2, 3}, new int[]{2, 2}, new int[]{1, 1, 1, 1, 1});
        flipArray(new int[]{1, 2, 3, 4});
    }

    public static void printStr(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArr(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void addNum(int n, int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += n;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void compareSum(int... arr) {
        int sum1 = 0;
        int sum2 = 0;
        if (arr.length % 2 > 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                sum1 += arr[i];
            }
            for (int i = arr.length / 2 + 1; i < arr.length; i++) {
                sum2 += arr[i];
            }
        }
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                sum1 += arr[i];
            }
            for (int i = arr.length / 2; i < arr.length; i++) {
                sum2 += arr[i];
            }
        }
        if (sum1 > sum2) {
            System.out.println("сумма левой стороны массива больше");
        } else {
            System.out.println("сумма правой стороны массива больше");
        }
    }

    public static void sumArray(int[] arr, int[] arr1, int[] arr2) {
        int n = 0;
        if (arr.length > arr1.length & arr.length > arr2.length) {
            n = arr.length;
        } else if (arr1.length > arr2.length) {
            n = arr1.length;
        } else {
            n = arr2.length;
        }
        int[] result = new int[n];
        int[] copyArr = Arrays.copyOf(arr, n);
        int[] copyArr1 = Arrays.copyOf(arr1, n);
        for (int i = 0; i < n; i++) {
            result[i] = copyArr[i] + copyArr1[i] + arr2[i];
        }
        System.out.println(Arrays.toString(result));
    }

    public static void flipArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
