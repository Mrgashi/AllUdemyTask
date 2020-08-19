package src.com.udemy.threads;

import static src.com.udemy.threads.ThreadColor.ANSI_CYAN;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_CYAN + "Hello from Runnable class");
    }
}
