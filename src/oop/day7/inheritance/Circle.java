package oop.day7.inheritance;

public class Circle extends Shape {
    private double radius;


    public Circle() {
        this.name = "Circle";
        this.radius = 0;
    }

    public Circle(double radius) {
        this.name = "Circle";
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI) * radius;
    }

    public String getInfo() {
        return String.format("Radius = %.3f \t Area= %.3f \t Perimeter= %.3f", radius, getArea(),getPerimeter());
    }

    public double getParentArea(){
      return   super.getArea();
    }
}
