public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public double distance() {
        return Math.sqrt((-this.getX()) * (-this.getX()) +  (-this.getY()) * (-this.getY()));
    }
    public double distance (int x, int y) {
        return Math.sqrt((x - this.getX()) * (x - getX()) + (y - this.getY()) * (y - this.getY()));
    }

    public double distance (Point B) {
        return Math.sqrt((B.getX() - this.getX()) * (B.getX() - this.getX()) + (B.getY() - this.getY()) * (B.getY() - this.getY()));
    }
}

// d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
//How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula: