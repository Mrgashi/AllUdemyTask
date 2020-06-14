// Creating the Dog class and giving it the Animal traits.
public class Dog extends Animal{

    // Dogs have some other fields that Animals more generic fields dont have, or we would like to add other fields such as coat, tail and so on to Dog.
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Create Dog constructor or "bluePrint" and add the extra fields that are more targeted to Dog.
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // super is what it has gotten from Animal class, what it is inheriting from their parent class.
        super(name, 1, 1,  size, weight);
        // here we add our Dog fields and initialize them.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //@Override means that this method should not use the method made in Animal, as dogs eat differently than other Animals
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    public void walk() {
        System.out.println("Dog.walk() from dog class");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() from Dog Class");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
    // again here we want our Dog to move in a different way than what an Animal does. So we Override the Animal function.
     @Override
       public void move(int speed) {
         System.out.println("Dog.move() called");
         moveLegs(speed);
         super.move(speed);
     }
}
