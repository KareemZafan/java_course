package day5;

public class Strings {
    public static void main(String[] args) {
    /*  *//*  String a = "Hello, World";
        System.out.println(a.charAt(4));*//*

        String x = "Kareem";
        String f = "Kareem";

        System.out.println(f.toUpperCase());
        System.out.println(concat1("Kareem", "Mohamed"));

        String y = new String("Kareem");

        if( x.equals(f) ){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        String name = "     Ahmed Hammad Ali    k ";
        System.out.println(name.contains("AliAl"));
        name = name.trim();
        System.out.println(name.endsWith("k"));*/

        //StringBuffer
        StringBuilder myString = new StringBuilder("My name is Kareem");
        myString.append(10); //Mutable   //immutable
        System.out.println(myString);
        //myString.reverse();
        myString.replace(0,7,"Name");
        System.out.println(myString);
        myString.deleteCharAt(myString.length()-1);
        System.out.println(myString);

        StringBuffer myString2 = new StringBuffer("Hello, World");

        myString2.insert(0,"Greeting ");
        System.out.println(myString2);

        String myNumberString = "This my mobile number: %s";
        System.out.println(String.format(myNumberString,"99392939239293"));
        System.out.println(String.format("Hello World value is %.2f",9.80));

        System.out.println( String.join("-","27","10", "1996"));





    }

    private static String concat1(String str, String str2){
        return str+str2;
    }
}
