package day2;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 80;

     /*   int tempValue = 0 ;

        tempValue = a ;
        a = b ;
        b = tempValue ;

        System.out.println("a = "+a+ "\t b= "+b);*/
   /*     a += b;
        b = a - b;  // 10
        a -= b;   // 80
        System.out.println("a = " + a + "\t b= " + b);*/
/*
        a ^= b;
        b = a ^ b;  // 10
        a ^= b;   // 80
        System.out.println("a = " + a + "\t b= " + b);
        System.out.println("Enter your amount: ");
        double current = new Scanner(System.in).nextDouble();
        boolean isActive = (current >= 1000) ? true : false;
        System.out.println(isActive ? "Your account is active" : "Your account is not active");*/

/*
        String state = (a < b) ? "A is larger than b" : "A is not lager than b";
        System.out.println(state);*/

        /* System.out.println((a != b) ? ++a  : --b);*/


        double value = (100 / (2 + 10)) + (30 * 90) - (5 % 3);
        System.out.println(value);

    }
}