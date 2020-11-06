package src.com.udemy.threads;

public class Worker {
    private String name;
    private boolean active;

    public Worker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }


    public synchronized void work(SharedRecourse sharedRecourse, Worker otherWorker) {

        while (active) {
            if (sharedRecourse.getOwner() != this ) {
                try {
                    wait(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }

            if (otherWorker.isActive()) {
                System.out.println(getName() + " : give the resource to the worker" + otherWorker.getName());
                sharedRecourse.setOwner(otherWorker);
            }

            System.out.println(getName() + " :  working on a common recource" );
            active = false;
            sharedRecourse.setOwner(otherWorker);
        }
    }
}
