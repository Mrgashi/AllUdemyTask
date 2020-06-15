public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (getArea() * getHeight());
    }

}

//Write the following methods (instance methods):
//* Method named getHeight without any parameters, it needs to return the value of height field.
//* Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.
