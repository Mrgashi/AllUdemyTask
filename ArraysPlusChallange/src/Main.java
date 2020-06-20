import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        // while flag to start the loop. We set the flag to true and only change it if our if check makes sure the arrays are sorted.
        while (flag) {
            // immediately set to false, because we are going to set it to true if the code continues after.
            flag = false;
            // looping over the sortedArray that was given the non sorted array. finishing 1 less than the total because we hare +1 in the unsorted array.
            for (int i = 0; i < sortedArray.length - 1; i++) {
                // we immediately go into a if check. We are checking if the first position in the sorted array is less than the second position of the unsorted array.
                if (sortedArray[i] < sortedArray[i + 1]) {
                    // if the sortedArray position i is greater than the unsorted Array it will be moved into a temp array in the correct position.
                    temp = sortedArray[i];
                    // this is where the swap happens. by putting the sortedArray i into sortedArray i + 1(the next position)
                    sortedArray[i] = sortedArray[i + 1];
                    // and now we are moving the sortedArray into the temp array in the correct position.
                    sortedArray[i + 1] = temp;
                    // if we have come to this point we start the whole proses again. Only exiting if sortedArray[i] is not less than array[i+1].
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents" + array[i]);
        }
    }

    public static int[] getIntegers(int capasity) {
        int[] array = new int[capasity];
        System.out.println("Enter " + capasity + " integer values \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

}
