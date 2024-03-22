package oop;

public class Main {
    public static void main(String[] args) {
       /* Box myBox = new Box();  // Declaring to object
        myBox.length = 10;
        myBox.width = 10;
        myBox.height = 10;
        System.out.println(myBox.getVolume());*/


        Box y = new Box(60);
        System.out.println(
                y
                        .setLength(100)
                        .setWidth(20)
                        .setHeight(200)
                        .getVolume());


        System.out.println(y.getLength() + "\t" + y.getWidth() + "\t" + y.getHeight());

        Box thirdBox = new Box(10,20,30);

        System.out.println(thirdBox.getLength() + "\t" + thirdBox.getWidth() + "\t" + thirdBox.getHeight());
        System.out.println(thirdBox.getVolume());


    }


}
