public class DeluxBurger  extends  Hamburger{
    private double basePrice = 12;
    private double additionalPrice = 0;
    private double additions = 0;

    public DeluxBurger(String breadRollType, String meat, String nameOfBurger) {
        super("Beautiful Burger bunns", "Ground sirloin", "Delux 2000");
    }
    public void addChips () {
        if(additions < 2) {
            additions ++;
            System.out.println("+ Chips");
            additionalPrice += 1.50;
        } else {
            System.out.println("Cant add more chips...");
        }
    }
    public void addDrinks () {
        if (additions < 2) {
            additions ++;
            System.out.println("+ Drinks");
            additionalPrice += 2.0;
        } else {
            System.out.println("Cant add more drink...");
        }
    }

    @Override
    public double totalPrice() {
        return basePrice + additionalPrice;
    }

    @Override
    public double getBasePrice() {
        return basePrice; 
    }
}

