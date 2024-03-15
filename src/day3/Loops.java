package day3;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
      /*    int i = 2 ;
        for (; i <= 100; ) {
            System.out.println(i);
            i *=2;

        }

        double sum = 0 ;
        Scanner input = new Scanner(System.in);
        for (int j = 1; j <=5 ; j++) {
            System.out.println("Enter a number: ");
            sum += input.nextDouble();
        }
        System.out.println("Summation = "+sum);*/

       /* int counter = 0 ;
        while(counter<5) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int a = input.nextInt();
            System.out.println("Enter first number: ");
            int b = input.nextInt();
            System.out.println("sum= " +(a + b));
            counter++;
        }*/

        /*int choice;
        do {
            System.out.println("1- Open");
            System.out.println("2- Edit");
            System.out.println("3- Close");
            System.out.println("4- Delete");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            System.out.println(choice);
        } while (choice != -1);*/
     /*   int num;
        System.out.println("Enter a key: ");
        num = new Scanner(System.in).nextInt();
        while (num != 70) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your number: ");
            num = input.nextInt();
            System.out.println(num + " + 5 = " + (num + 5));
        }*/
     /*   System.out.println("Enter the key: ");
        int num = new Scanner(System.in).nextInt();

        for ( ; num != 70 ; ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your number: ");
            num = input.nextInt();
            if(num == 70){
                break;
            }
            System.out.println(num + " + 5 = " + (num + 5));

        }*/

        for (int i = 1; i < 100; i++) {
            if(i == 40){
                continue;
            }
            System.out.println(i);

        }
    }


}
