public class Main {
    public static void main(String[] args) {

        Vehicle genericVehicle = new Vehicle(4, 50, 40);
        genericVehicle.setHorsePower(130);
        genericVehicle.setSpeed(100);
        genericVehicle.setWheels(4);
        System.out.println(genericVehicle.getSpeed());
        System.out.println(genericVehicle.getHorsePower());
        System.out.println(genericVehicle.getWheels());
        genericVehicle.accelerate();
        genericVehicle.breaking();
        System.out.println("################################ Vehicle");

        Car audi  = new Car();
        audi.setManufacture("Volkswagen");
        audi.setWheels(4);
        audi.setDoors(5);
        audi.setFuel("Diesel");
        audi.setSportMode(true);
        audi.setHorsePower(200);
        audi.setSpeed(250);

        System.out.println(audi.getDoors() + "Doors on a Audi");
        System.out.println(audi.getHorsePower() + "Hp");
        System.out.println(audi.getWheels() + "wheels on Audi");
        System.out.println(audi.getFuel());
        System.out.println(audi.getManufacture());
        System.out.println(audi.getSpeed());
        System.out.println(audi.isSportMode());
        audi.accelerate();
        audi.breaking();
        audi.openHood();
        audi.changeGear();

        System.out.println("########################## AUDI");

        Tesla bestCar = new Tesla();
        bestCar.setDoors(2);
        bestCar.setManufacture("Tesla Corp.");
        bestCar.setSportMode(true);
        bestCar.setColor("Black on Black");
        bestCar.setSeatFabric("Alcantara Leather");
        bestCar.setAutomatic(true);
        bestCar.setCruiseControl(true);
        bestCar.setButtons(5);
        bestCar.setHorsePower(750);
        bestCar.setSpeed(250);
        bestCar.setFuel("Electric");
        bestCar.setWheels(4);

        bestCar.accelerate();
        bestCar.breaking();

        bestCar.setAutoPilot(true);
        System.out.println(bestCar.isAutoPilot() + " Car is now driving itself.");
        bestCar.openHood();
        bestCar.changeGear();
    }
}
