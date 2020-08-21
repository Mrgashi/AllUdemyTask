package src.com.udemy.threads;

import java.util.Random;
import java.util.concurrent.*;

import static src.com.udemy.threads.Main.EOF;
import static src.com.udemy.threads.ThreadColor.*;

public class Main {

    public static final String EOF = "EOF";

    public static void main(String[] args) {
        // write your code here
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);
        // ExecutorService only allows 3 threads to run. changing this to 5 would make the future run whenever.
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        MyProducer producer = new MyProducer(buffer, ANSI_RED);
        MyConsumer consumer1 = new MyConsumer(buffer, ANSI_GREEN);
        MyConsumer consumer2 = new MyConsumer(buffer, ANSI_YELLOW);


        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ANSI_WHITE + "I am beeing printed form the callable class.");
                return "This is the callable result";
            }
        });

        try {
            System.out.println(future.get());
        } catch (ExecutionException e) {
            System.out.println("Something went wrong");
        } catch (InterruptedException e) {
            System.out.println("Thread running the task was interrupted.");
        }

        executorService.shutdown();
    }
}

class MyProducer implements Runnable {

    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};

        for (String num : nums) {
            try {
                System.out.println(color + "Adding..." + num);
                buffer.put(num);
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer was interupted...");
            }
        }

        System.out.println(color + "Adding End of Array/File/data and Exiting");
        try {
            buffer.put("EOF");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyConsumer implements Runnable {

    private ArrayBlockingQueue<String> buffer;
    private String color;


    public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (buffer) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    if (buffer.peek().equals(EOF)) {
                        System.out.println(color + "Exiting");
                        break;
                    } else {
                        System.out.println(color + "Removed." + buffer.take());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
/*
One thread to add data to a buffer. "Producer"
Two threads to read the data from the buffer. "Consumers"
 */