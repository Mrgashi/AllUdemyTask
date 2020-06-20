public class HealthyBurger extends Hamburger {
    private double basePrice = 8;
    private double additionalPrice = 0;
    private double additions = 0;

    public HealthyBurger(String breadRollType, String meat, String nameOfBurger) {
        super("Brow rye bread roll", "Angus beef", "Healthy Burger");
    }

    @Override
    public void addLettuce() {
        if (additions < 6) {
            additions++;
            System.out.println("+ Lettuce ");
            additionalPrice += 1.00;
        } else {
            System.out.println("Limit reached on additions...");
        }
    }

    @Override
    public void addTomatoes() {
        if (additions < 6) {
            additions++;
            System.out.println("+ Tomatoes");
            additionalPrice += 1.10;
        } else {
            System.out.println("Limit reached on additions...");
        }
    }

    @Override
    public void addPickles() {
        if (additions < 6) {
            additions ++;
            System.out.println("+ Pickles");
            additionalPrice += 1.00;
        } else {
            System.out.println("Limit reached on additions...");
        }
    }

    @Override
    public void addCarrot() {
        if ( additions < 6) {
            additions ++;
            System.out.println("+ Carrot");
            additionalPrice += 0.50;
        } else {
            System.out.println("Limit reached on additions...");
        }
    }
    public void addBbqSauce() {
        if (additions < 6) {
            additions ++;
            System.out.println("+ BBQ sauce");
            additionalPrice += 1.10;
        } else {
            System.out.println("Limit reached on additions...");
        }
    }
    public void addPineapple () {
        if (additions < 6 ) {
            additions ++;
            System.out.println("+ Pineapple");
            additionalPrice += 2.00;
        } else {
            System.out.println("Limit reached on additions...");
        }
    }

    @Override
    public double getBasePrice() {
        return 8;
    }

    @Override
    public double totalPrice() {
        return this.basePrice + this.additionalPrice;
    }
}

