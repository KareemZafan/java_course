package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptions {
    public static void main(String[] args) {
        try {
            System.out.println("Enter two values to divide: ");
            double a = new Scanner(System.in).nextDouble();
            double b = new Scanner(System.in).nextDouble();
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[2]); //Out of Bound Exception
            testThrowingException();


        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        } catch (InputMismatchException mismatchException) {
            System.out.println("Enter Two Double Values");
            double a = new Scanner(System.in).nextDouble();
            double b = new Scanner(System.in).nextDouble();
            System.out.println(2 / 3);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("DB has been closed ");
        }}

    private static void testThrowingException() throws Exception {
        throw new IllegalArgumentException(" An Exception has thrown");
    }
}
