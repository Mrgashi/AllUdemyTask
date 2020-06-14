public class Car extends Vehicle {

    private int doors;
    private String manufacture;
    private String fuel;
    private boolean sportMode;
    private int currentGear;

    public Car(int wheels, int horsePower, int speed, int doors, String manufacture, String fuel, boolean sportMode, int currentGear) {
        super(wheels, horsePower, speed);
        this.doors = doors;
        this.manufacture = manufacture;
        this.fuel = fuel;
        this.sportMode = sportMode;
        this.currentGear = currentGear;
    }

    public Car() {
        super();
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public boolean isSportMode() {
        return sportMode;
    }

    public void setSportMode(boolean sportMode) {
        this.sportMode = sportMode;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void openHood () {
        System.out.println("Opens hood to inspect engine");
    }
    public void changeGear () {
        System.out.println("Changing to appropriate gear");
    }

}

