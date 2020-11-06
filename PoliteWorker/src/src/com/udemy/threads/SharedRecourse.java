package src.com.udemy.threads;

public class SharedRecourse {

    private Worker owner;

    public SharedRecourse(Worker worker) {
        this.owner = worker;
    }

    public Worker getOwner() {
        return owner;
    }

    public  synchronized void setOwner(Worker owner) {
        this.owner = owner;
    }
}
