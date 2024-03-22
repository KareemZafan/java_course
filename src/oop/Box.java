package oop;

public class Box {

    private double width;
    private double length;
    private double height;

    public Box() {
    }

    public Box(double length) {
        this.length = this.width = this.height = length;
    }


    public Box(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public Box setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getLength() {
        return length;
    }

    public Box setLength(double length) {
        this.length = length;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Box setHeight(double height) {
        this.height = height;
        return this;
    }

    public double getVolume() {
        return ((length * width) * height);
    }
}
