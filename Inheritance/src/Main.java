public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 40, "Long Silky");
        dog.eat();
        dog.walk();
        dog.run();
        Fish barracuda = new Fish ("Barracuda", 1, 1, 4, 3, 2, 2, 2 );
        barracuda.move(30);
        barracuda.swim(32);
        barracuda.rest();
    }
}
