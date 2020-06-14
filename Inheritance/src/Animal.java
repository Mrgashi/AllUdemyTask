public class Animal {

    // Main class of Animal, this is what defines a animal and its general traits. Many Animals have these features.
    private  String name;
    private  int brain;
    private int body;
    private int size;
    private int weight;

    // Making a Animal constructor to give Animal its traits/fields.
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    // All Animals eat, this is a function al children classes( e.g Dog.java, Fish.java get these also when we extend Animal to them).
    public void eat() {
        System.out.println("Animal.eat() called from Animal class");
    }
    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }
    // Normal getters to get the fields when needed.
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
