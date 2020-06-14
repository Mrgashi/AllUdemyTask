public class Vehicle {

    private int wheels;
    private int horsePower;
    private int speed;

    public Vehicle(int wheels, int horsePower, int speed) {
    }

    public Vehicle() {

    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        System.out.println("Accelerating to " + getSpeed());
    }

    public void breaking() {
        System.out.println("Breaking down to " + (getSpeed() - 30));
    }

    public void steer() {
        System.out.println("Vehicle.steer()");
    }

}
// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.
