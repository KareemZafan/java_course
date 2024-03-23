package oop.day7.inheritance;

public class Rectangle extends Shape {

    private static int count = 0;
    private double length;
    private double width;

    public Rectangle() {
        this.name = "Rectangle";
        this.length = 0;
        this.width = 0;
        ++count;
    }

    public Rectangle(double length, double width) {
        this.name = "Rectangle";
        this.length = length;
        this.width = width;
        ++count;
    }

    public static int getCount() {
        return count;
    }

    public double getLength() {
        return length;
    }

    public Rectangle setLength(double length) {
        this.length = length;
        return this;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle setWidth(double width) {
        this.width = width;
        return this;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String getInfo() {
        //return "Width = "+width+" \t Length= "+length+"\tArea="+getArea()+"\tPerimeter="+getPerimeter();
        return String.format("Width = %.3f \t Length= %.3f\tArea=%.3f\tPerimeter=%.3f", width, length, getArea(), getPerimeter());
    }

    public void getText1() {
        System.out.println(this.getText());
    }
}
