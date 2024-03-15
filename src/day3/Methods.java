package day3;

import java.util.Scanner;

public class Methods {

    public static int a = 100;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double value1 = inp.nextDouble();
        double value2 = inp.nextDouble();

        System.out.println("Sum = " + add(value1, value2));

        print("Hello My team");

        System.out.println("Square root of " + value1 + " is " + getSquareRoot(value1));

        String primeValue = isPrime((int) value1) ? "prime" : "not prime";
        System.out.println(value1 + " is " + primeValue);


    }


    static void print(String value) {
        System.out.println(value);
    }


    public static double add(double a, double b) {
        return a + b;
    }

    private static double getSquareRoot(double value) {
        return Math.sqrt(value);
    }

    private static boolean isPrime(int value) {
        int valueSqrt = (int) (getSquareRoot(value));
        for (int i = 2; i < valueSqrt; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

}
