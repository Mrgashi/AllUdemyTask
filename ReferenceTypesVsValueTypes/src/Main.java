import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        // Arrays are reference types, this means that these are used as an address and not the object itself.
        // References the address to the array.
        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray[0]  = 1;

        // after we added the value 1 to the anotherIntArray,
        // both where updated, because they both point to the same memory slot where the array is located.
        // this would be changed to anotherArray if the there was constructed a new anotherIntArray.
        System.out.println("after change: myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change: anotherIntArray = " + Arrays.toString(anotherIntArray));

        // anotherIntArray now is gotten its own memoryslot - this is why it can hold other value than earlier.
        anotherIntArray = new int[] {4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("after modifying: myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modifying: anotherIntArray = " + Arrays.toString(anotherIntArray));

    }
    private static void modifyArray(int[] array) {

        array[0] = 2;
        // this is pointing to a new array.
        array = new int[] {1,2,3,4,5};
    }
}
