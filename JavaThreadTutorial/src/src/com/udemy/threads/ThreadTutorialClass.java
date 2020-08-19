package src.com.udemy.threads;

import static src.com.udemy.threads.ThreadColor.*;

public class ThreadTutorialClass {

    public static void main(String[] args) {
        threadTutorial();
    }

    public static void threadTutorial() {
        // running in main thread.
        System.out.println(ANSI_RED + "main Thread");

        // running from AnotherThread class
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();

        // running from MainThread
        System.out.println(ANSI_RED + "main Thread");

        // making a new anon Thread and initiating it instantly with the .start();
        new Thread(() -> System.out.println(ANSI_BLUE + " anon class thread")).start();
        /*
        Threads do not guarantee what order they run.
         */

        Thread myRunnableFromThreadRunnableClass = new Thread(new ThreadRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_CYAN + "This is from anon runnable class");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "Another thread terminated or timed out. So i am running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_GREEN + "I could not wait after all, i was interrupted");
                }
            }
        });
        myRunnableFromThreadRunnableClass.start();
    }
}
