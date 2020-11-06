package src.com.udemy.threads;

public class Vehicle {
    int wheels;
    String name;
    String model;
    double speed;

    public Vehicle(int wheels, String name, String model, double speed) {
        this.wheels = wheels;
        this.name = name;
        this.model = model;
        this.speed = speed;
    }

    public double accelarate(double newSpeed) {
        return this.speed += newSpeed;
    }

    public boolean break(boolean isBreaking) {
    }
    public double getSpeed() {
        return this.speed;
    }
}
