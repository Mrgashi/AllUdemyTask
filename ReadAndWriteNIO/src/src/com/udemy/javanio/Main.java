package src.com.udemy.javanio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Pipe;

public class Main {

    public static void main(String[] args) {
        try {
            Pipe pipe = Pipe.open();

            Runnable writer = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SinkChannel sinkChannel = pipe.sink();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for (int i = 0; i < 10; i++) {
                             String currentTime = "The time is: " + System.currentTimeMillis();
                             buffer.put(currentTime.getBytes());
                             buffer.flip();

                             while (buffer.hasRemaining()) {
                                 sinkChannel.write(buffer);
                             }
                             buffer.flip();
                             Thread.sleep(100);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };


            Runnable reader = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SourceChannel sourceChannel = pipe.source();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for (int i = 0; i < 10; i++) {
                             int bytesRead = sourceChannel.read(buffer);
                             byte[] timeString = new byte[bytesRead];
                             buffer.flip();
                             buffer.get(timeString);
                            System.out.println("Reader Thread: " + new String(timeString));
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };

            new Thread(writer).start();
            new Thread(reader).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
        //  try (FileOutputStream binFile = new FileOutputStream("data.dat");
      //       FileChannel binChannel = binFile.getChannel()) {

      //      ByteBuffer buffer = ByteBuffer.allocate(100);
      //      byte[] outputBytes = "Hello World!".getBytes();
      //      byte[] outputBytes2 = "Nice to meet you!".getBytes();
      //      buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2).putInt(10000);
      //      buffer.flip();


      //      binChannel.write(buffer);

      //      RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
      //      FileChannel channel = ra.getChannel();

      //      ByteBuffer readBuffer = ByteBuffer.allocate(100);
      //      channel.read(readBuffer);
      //      readBuffer.flip();
      //      byte[] inputString = new byte[outputBytes.length];
      //      readBuffer.get(inputString);
      //      System.out.println("inputString = " + new String(inputString) );
      //      System.out.println("int1 = " + readBuffer.getInt());
      //      System.out.println("int2 = " + readBuffer.getInt());
      //      byte[] inputString2 = new byte[outputBytes2.length];
      //      readBuffer.get(inputString2);
      //      System.out.println("inputString2 = " + new String(inputString2));
      //      System.out.println("int 3 = " + readBuffer.getInt());


      //      RandomAccessFile copyFile = new RandomAccessFile("datacopy.data", "rw");
      //      FileChannel copyChannel = copyFile.getChannel();
      //      channel.position(0);
//    //        long numTransferred = copyChannel.transferFrom(channel, 0, channel.size());
      //      long numTransferred = channel.transferTo(0, channel.size(), copyChannel);
      //      System.out.println("File transfered = " + numTransferred);
      //      channel.close();


      //  } catch (IOException e) {
      //      e.printStackTrace();
      //  }
    }

    private static void raoRead(byte[] outputBytes) throws IOException {
        RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
        byte[] b = new byte[outputBytes.length];
        ra.read(b);
        System.out.println(new String(b));

        long int1 = ra.readInt();
        long int2 = ra.readInt();
        System.out.println(int1);
        System.out.println(int2);
    }
}
