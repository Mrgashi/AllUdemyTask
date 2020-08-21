package src.com.udemy.threads;


import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static ReentrantLock lock = new ReentrantLock(true); // First come first serve order.
    /*
    Fairness is first come first serve, some threads can still lock and have to wait.
    try lock does not honor the fairness.
     */

    public static void main(String[] args) {

        Thread t1 = new Thread(new Worker(ThreadColor.ANSI_RED), "Prio: 10");
        Thread t2 = new Thread(new Worker(ThreadColor.ANSI_BLUE), "Prio: 8");
        Thread t3 = new Thread(new Worker(ThreadColor.ANSI_GREEN), "Prio: 6");
        Thread t4 = new Thread(new Worker(ThreadColor.ANSI_CYAN), "Prio: 4");
        Thread t5 = new Thread(new Worker(ThreadColor.ANSI_PURPLE), "Prio: 2");

        // loosely given priority. changing the start will have some impact.
        // setting priority can cause starvation.
        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(6);
        t4.setPriority(4);
        t5.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    private static class Worker implements Runnable {
        private int runCount = 1;
        private String threadColor;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                lock.lock();
                try {
                    System.out.format(threadColor + "%s: runCount = %d%n", Thread.currentThread().getName(), runCount++);
                    // execute critical section of code.
                    // lets pretend that there is a critical code.
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
