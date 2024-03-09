package day1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*   char myChar = 'A';
        System.out.println(myChar);
        myChar = Character.toLowerCase(myChar);
        System.out.println(myChar);

        int sum = 10 + 35536 ;  // stackoverflow

        float pi = 3.14f;
        System.out.println(sum);


        String name ="ProCode Course";

        System.out.println(name.charAt(4));

       double x = 5 ;

        byte casting = (byte)36.5; //36
        System.out.println(casting);
        */


    /*  int x = 90;
        byte y = 30;
        int result = (int) (x + y) ;
        System.out.println(++result +" "+ result--);

        x += (int) (2*y);
        System.out.println(x);

        System.out.println(50%6);
        int range = 1 + (75857 % 50) ;  //1 50
        System.out.println(range);*/

        /*int length = 0;
        int width = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        length = input.nextInt();
        System.out.println("Enter the width of rectangle: ");
        width = input.nextInt();
        int area = width * length;
        System.out.println("Area = " + area);*/

        /*Scanner inp = new Scanner(System.in);
        System.out.println("Enter min value in range: ");
        int minBand = inp.nextInt();
        System.out.println("Enter max value in range: ");
        int maxBand = inp.nextInt();
        System.out.println("Enter a value");
        int value = inp.nextInt();

        int range =  (value % maxBand) ;
        System.out.println(range);*/

        System.out.println("Enter a year: ");
        int year = new Scanner(System.in).nextInt();
        boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        System.out.println(isLeapYear);

        System.out.println(12 / 5.0);
    }
}
