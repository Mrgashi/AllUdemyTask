package src.com.udemy.threads;

public class Main {

    public static void main(String[] args) {
	// write your code here

        final PolitePerson jane = new PolitePerson("Jane");
        final PolitePerson jhon = new PolitePerson("Jhon");

        new Thread(new Runnable() {
            @Override
            public void run() {
                jane.sayHello(jhon);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                jhon.sayHello(jane);
            }
        }).start();

    }

    static class PolitePerson {

        private final String name;

        public PolitePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void sayHello(PolitePerson person) {
            System.out.format("%s: %s" + " has said hello to me!%n", this.name, person.getName());
            person.sayHelloBack(this); // program will deadlock here as both objects will try to use this method while the other one is also trying.
        }

        public synchronized void sayHelloBack(PolitePerson person) {
            System.out.format("%s: %s" + " has said hello back to me!%n", this.name, person.getName());
        }
    }
}

