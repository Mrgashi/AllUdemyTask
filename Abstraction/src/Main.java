public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Fido");
        dog.eat();
        dog.breath();

        Bird bird = new Parrot("Parrot");
        bird.fly();
        bird.breath();
        bird.eat();

        Bird penguin = new Penguin("King");
        penguin.fly();


    }
}
