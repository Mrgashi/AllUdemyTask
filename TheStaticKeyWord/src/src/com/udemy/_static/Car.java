package src.com.udemy._static;

public class Car {
    private static int numberOfCars;
    private String name;

    public Car(String name) {
        this.name = name;
        numberOfCars++;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public String getName() {
        return name;
    }
}
