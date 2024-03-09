package day2;

import java.util.Scanner;

public class ValueDigits {
    public static void main(String[] args) {
        System.out.println("Enter your value: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        // 456
        int sum = 0;
        sum += value % 10; // 6
        value /= 10;  //45
        sum += value % 10; //11
        value /= 10;
        sum += value % 10; //15

        System.out.println("Digit's sum = " + sum);
    }
}
