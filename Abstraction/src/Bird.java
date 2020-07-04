
public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(" Pecking food");
    }

    @Override
    public void breath() {
        System.out.println(this.getName() + " Breathing");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
