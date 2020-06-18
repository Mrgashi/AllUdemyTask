public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("north");
        Ceiling ceiling = new Ceiling(2, 55);
        Bed bed = new Bed("Modern", 4, 3, 2,1);
        Lamp lamp = new Lamp("Modern", false, 40);

        Bedroom bedroom = new Bedroom("Master bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
