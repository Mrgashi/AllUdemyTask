public class Carpet {

    private double cost;

    public Carpet(double cost) {
        if (cost < 0.0d){
            this.cost = 0.0d;
        }
        this.cost = cost;
    }
    public double getCost(){
       return this.cost;
    }
}
