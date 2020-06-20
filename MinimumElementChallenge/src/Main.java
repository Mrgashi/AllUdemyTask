import java.util.Arrays;
import java.util.Scanner;

public class Main {

   public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please type tim for tims solution or mirdon for mirdons solution");
        String answer = scanner.nextLine();

        if (answer.equals("mirdon")){
            originalSolution();
        } else if (answer.equals("tim")){
            timsSolution();
        } else {
            System.out.println("You failed to answer correctly. Please try agian");
        }
    }

    private static void originalSolution() {

        System.out.println("Would you like to know the max or min of the array? \n" + "Please type: min for the minimum number in the array \n" +
                "Or Please type: max for the max number in the array");

        String answer = scanner.nextLine();
        if (answer.equals("min")) {
            System.out.println("Please enter count: ");
            int count = scanner.nextInt();

            int[] inputFromUser = readIntegers(count);
            System.out.println("Array entered: " + Arrays.toString(inputFromUser));

            int lowestInt = findMin(inputFromUser);
            System.out.println("LowestInt in the array is: " + lowestInt);
        } else if (answer.equals("max")){
            System.out.println("Please enter count: ");
            int count = scanner.nextInt();

            int[] inputFromUser = readIntegers(count);
            System.out.println("Array entered: " + Arrays.toString(inputFromUser));

            int maxInt = findMax(inputFromUser);
            System.out.println("maxInt in the array is: " + maxInt);
        }

    }

    private static void timsSolution() {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMinTimsSolutin(returnedArray);
        System.out.println("min = " + returnedMin);
    }
    // this method takes in the int count . this is provided by the method when making it.
    public static int[] readIntegers(int count) {
        // making a new int with the size of count. This will give is a number to loop over.
        // initiating the array with the size of count.
        int[] intArray = new int[count];
        System.out.println("Please add numbers to your array \r");
        // moving into a for loop to add numbers to our array via the scanner class.
        for (int i = 0; i < intArray.length; i++){
            // this line under adds numbers to the i position of the for loop.
            intArray[i] = scanner.nextInt();
        }
        // returns the intArray with the new numbers filled inn by the scanner.
        return intArray;
    }

    public static int findMin (int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i +1 ]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = false;
                }
            }
        }
        return sortedArray[sortedArray.length -1];
    }

    public static int findMax(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = false;
                }
            }
        }
        return sortedArray[sortedArray.length - 1];
    }

    public static int findMinTimsSolutin(int [] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

}
