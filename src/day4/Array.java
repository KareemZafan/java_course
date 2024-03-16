package day4;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] elements = new int[15];    // 0 --> 14  // int arr[10] = {0}

      /*  elements[9] = 20;
        System.out.println(elements[9]);

        for (int i = 0; i < elements.length; i++) {
            elements[i] = i + 1; //1 2 3         15
            System.out.print(elements[i] + "\t");
        }*/

        /*for(int i:values){
            i += 5;
            System.out.print(i+"\t");
        } //enhanced for*/

        /*  System.out.println(values[10]);*/

        double[] arr = {2, -90, 49, 0, 4}; // -90 0 2 4 49

        /*for (double a : sort(arr)) {
            System.out.print(a + "\t");
        }*/
        System.out.println(binarySearch(arr,-70));
        System.out.println(Arrays.binarySearch(arr, 0));

    }

    private static double[] sort(double[] myArray) {
        double temp = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }

            }

        }
        return myArray;
    }

    private static int binarySearch(double[] arr, double key) {
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (high >= low) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
