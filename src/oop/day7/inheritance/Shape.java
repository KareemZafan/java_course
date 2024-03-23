package oop.day7.inheritance;

public  class Shape {
    protected String name;

    public Shape() {
        name = "";
    }

    public Shape(String name) {
        this.name = name;
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    public final String getText(){
        return "NULL";
    }

    public String getInfo(){
        return "";
    }

}
