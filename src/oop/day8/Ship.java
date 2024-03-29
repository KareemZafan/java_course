package oop.day8;

public class Ship extends Vehicle {
    @Override
    public void start() {
        System.out.println("Start the ship...");
    }

    @Override
    public void stop() {
        System.out.println("Stop the ship...");
    }

}
