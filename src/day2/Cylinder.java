package day2;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your circle's radius: ");
        double radius = input.nextDouble();
        System.out.println("Enter your cylinder's height : ");
        double height = input.nextDouble();

        double cylinderVolume = 3.14 * height * radius * radius;
        System.out.println("Cylinder volume = "+cylinderVolume);


    }
}
