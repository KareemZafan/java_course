package day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
       /* int[] arr = {8, 7, 8, 1, 2, 3};

        int[] result = reverse(arr);

        for (int i : result) {
            System.out.print(i + "\t");
        }
        System.out.println("\n###################################\n");
        for (int i : reverse2(arr)) {
            System.out.print(i + "\t");
        }
        System.out.println("\n###################################\n");

        System.out.println(getSum(1, 3));*/


        Integer[] array = {0, -2, 4, -8, 7}; // -8 -2 0 4 7
        Arrays.sort(array, Comparator.reverseOrder());
       // Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + "\t");
        }

    }

    // 8 7 8 1 2 3
    private static int[] reverse(int[] list) {
        int[] duplicateArray = new int[list.length];

        for (int i = list.length - 1, j = 0; i >= 0; i--, j++) {
            duplicateArray[j] = list[i];
        }
        return duplicateArray;
    }

    // 3 4 6 7 8
    private static int[] reverse2(int[] list) {
        int temp;
        for (int i = 0; i < list.length / 2; i++) {
            temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }
        return list;
    }

    private static double getSum(double... values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }



}
