package oop.day7.inheritance;

public  abstract class Shape {
    protected String name;

    public abstract double getArea();

    public abstract double getPerimeter();

    public final String getText(){
        return "NULL";
    }

    public String getInfo(){
        return "";
    }

}
