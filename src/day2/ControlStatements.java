package day2;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        System.out.println("Enter age: ");
        byte age = new Scanner(System.in).nextByte();

   /*     if (age < 20){
            System.out.println("Teenager");
        }
        else{
            System.out.println("It's okay");
        }*/


        System.out.println((age < 20) ? "Teenager" : "It is okay");
        System.out.println("End of program");

        double totalDegree = 500;
        System.out.println("Enter your accumulative degree: ");
        double degree = new Scanner(System.in).nextDouble();
        double grade = (degree / totalDegree) * 100.00;
        String studentState = "";

        /**
         * control statements
         */

        if (grade >= 65.00 && grade < 75.00) {
            studentState = "Good";
        } else if (grade >= 75.00 && grade < 85.00) {
            studentState = "Very Good";
        } else if (grade >= 50.00 && grade < 65.00) {
            studentState = "Fair";
        } else if (grade >= 85.00 && grade < 100.00) {
            studentState = "Excellent";
        }  else if (grade < 50.00 &&  grade >= 0.00) {
            studentState = "Failed";
        }
        else {
            studentState= "Undefined";
        }
        System.out.println(studentState.equals("Undefined") ? "Invalid degree!!" : studentState );
    }
}
