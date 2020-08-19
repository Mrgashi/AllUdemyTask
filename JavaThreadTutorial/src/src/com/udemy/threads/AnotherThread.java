package src.com.udemy.threads;

import static src.com.udemy.threads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE + " 3 seconds have passed and im awake");
    }
}
