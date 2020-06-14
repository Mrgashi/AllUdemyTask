public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {
        System.out.println("Fish.rest(), fish is resting, fish dont sleep.");
    }

    public void moveMuscles() {
        System.out.println("Fish.moveMusces(), Activating muscles to move.");
    }

    public void moveBackFin() {
        System.out.println("Fish.moveBackFin(), Moving backfin to move.");
    }
    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
