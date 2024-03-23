package oop.day7.inheritance;

public class TestInheritance {
    public static void main(String[] args) {


        Rectangle rect = new Rectangle(10, 3);
        System.out.println(rect.getInfo());
        System.out.println(rect.getArea() + "\n" + rect.getPerimeter());

        Shape rect2 = new Rectangle(30, 5);
        System.out.println(rect2.getArea() + "\t" + rect2.name);
        rect.getText();
        Circle myCircle = new Circle(12.4);

        System.out.println(myCircle.getInfo());

        Engineer moustafa = new Engineer("Mostafa",
                "2973883738373837", "Engineering", "Excellent");


        printShapeInfo(new Rectangle(20, 50));
        printShapeInfo(new Circle(3));

        printAnimalInfo(new Cat());
        printAnimalInfo(new Dog());

        System.out.println(rect.getCount());




    }

    private static void printShapeInfo(Shape shape) {
        if (shape instanceof Rectangle) {
            System.out.println("Welcome Rectangle 🦧");
        }
        else
        {
            System.out.println("Welcome Circle 🦧");
        }

        System.out.println(shape.getInfo());
    }

    private static void printAnimalInfo(Animal animal) {
        System.out.println(animal.eat());
    }


}
