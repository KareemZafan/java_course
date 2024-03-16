package day4;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("sum = " + add(1));
        System.out.println("sum = " + add(1, 2, 40));
        System.out.println("sum = " + add(3.7, 0.8));
        System.out.println("sum = " + add(2, 5));
        System.out.println("sum = " + add(0.9 + 0.8 + 90));
        System.out.println("Power(2,4)=" + power(2, 4));
        System.out.println(mean(12345));
        System.out.println(mean(666));
        System.out.println(mean(0));
        System.out.println(mean(42));


    }


    /**
     * same name but different params
     */

    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }

    private static int add(double a, double b) {
        return (int) (a + b);
    }

    private static double add(double a) {
        return a + 10;
    }

    private static double add(double a, double b, double c) {
        return a + b + c;
    }

    private static long power(int base, int exp) {

        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    private static int mean(int value) {
        int sum = 0;
        byte counter = 0;
        if (value == 0) {
            return 0;

        } else {
            while (value != 0) {
                sum += value % 10;

                value /= 10;
                ++counter;
            }
        }

        return sum/counter;
    }


}
