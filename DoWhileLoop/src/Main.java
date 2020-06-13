import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        doWhileLoop();

    }

    private static void doWhileLoop() {
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5){
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 != 1;
    }


    public static void testWhile () {
        int number = 0;

        while (number < 10) {
            number++;

            if (number == 8) {
                System.out.println("NUMBER IS 8");
            }
            System.out.println(number);
        }
    }

    public static void testDoWhile () {
        int number = 0;
        do {
            number++;
        } while (number < 10);
    }

    public static class Storer {
        public  void printToFile (String filename) throws Exception{
            PrintWriter writer = new PrintWriter(filename);
            writer.println("Hello world");
            writer.close();
        }
    }
}
