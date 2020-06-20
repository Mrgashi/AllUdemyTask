public class Hamburger {

    private String breadRollType;
    private String meat;
    private double basePrice = 5;
    private String nameOfBurger;
    private double additionalPrice = 0;
    private double additions = 0;

    public Hamburger(String breadRollType, String meat, String nameOfBurger) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.nameOfBurger = nameOfBurger;
    }

    public void addLettuce() {
        if (additions < 4) {
            additions++;
            System.out.println("+ Lettuce");
            additionalPrice += 0.50;
        } else {
            System.out.println("Limit reached on additions...");
        }
    }

    public void addTomatoes() {
        if (additions < 4) {
            additions++;
            System.out.println("+ Tomatoes");
            additionalPrice += 1.0;
        } else {
            System.out.println("Limit reached on additions...");
        }
    }

    public void addPickles() {
        if (additions < 4) {
            additions++;
            System.out.println("+ Pickles");
            additionalPrice += 0.50;
        } else {
            System.out.println("Limit reached on additions...");
        }
    }

    public void addCarrot() {
        if (additions < 4) {
            additions++;
            System.out.println("+ Carrot");
            additionalPrice+= 1.00;
        } else {
            System.out.println("Limit reached on additions...");
        }
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getNameOfBurger() {
        return nameOfBurger;
    }

    public double getBasePrice() {
        return 5;
    }

    public double totalPrice () {
        return basePrice + additionalPrice;
    }
    public double getAdditionalPrice() {
        return additionalPrice;
    }
}
