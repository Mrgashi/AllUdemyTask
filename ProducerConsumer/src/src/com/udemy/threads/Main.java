package src.com.udemy.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static src.com.udemy.threads.Main.EOF;
import static src.com.udemy.threads.ThreadColor.*;

public class Main {

    public static final String EOF = "EOF";

    public static void main(String[] args) {
	// write your code here
        List<String> buffer = new ArrayList<String>();
        MyProducer producer = new MyProducer(buffer, ANSI_RED);
        MyConsumer consumer1 = new MyConsumer(buffer, ANSI_GREEN);
        MyConsumer consumer2 = new MyConsumer(buffer, ANSI_YELLOW);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();

    }
}

class MyProducer implements Runnable{

    private List<String> buffer;
    private String color;

    public MyProducer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2","3","4","5"};

        for (String num : nums) {
            try {
                System.out.println(color + "Adding..." + num);
                synchronized (buffer) {
                    buffer.add(num);
                }

                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e){
                System.out.println("Producer was interupted...");
            }
        }

        System.out.println(color + "Adding End of Array/File/data and Exiting");
        synchronized (buffer) {
            buffer.add("EOF");
        }
    }
}

class MyConsumer implements Runnable{

    private List<String> buffer;
    private String color;

    public MyConsumer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (buffer) {
                if (buffer.isEmpty()) {
                    continue;
                }
                if (buffer.get(0).equals(EOF)){
                    System.out.println(color + "Exiting");
                    break;
                } else {
                    System.out.println(color + "Removed." + buffer.remove(0));
                }
            }
        }
    }
}
/*
One thread to add data to a buffer. "Producer"
Two threads to read the data from the buffer. "Consumers"
 */