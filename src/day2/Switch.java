package day2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter number of day: ");
        byte day = new Scanner(System.in).nextByte();

        switch (day) {
            case 1:
            case 7:
                System.out.println("Holiday");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Working Day");
                break;
            default:
                System.out.println("Out of week range 1:7");
        }

    }
}
