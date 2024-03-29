package oop.day8;


// Ship , Car , Motorcycle , Bicycle
public abstract class Vehicle {
    private int maxSpeed;
    private int speed;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void start();

    public abstract void stop();

    public int getCurrentSpeed() {
        return speed;
    }


}
