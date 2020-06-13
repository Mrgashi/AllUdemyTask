package src.com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Min Integer: " + myMinIntValue + "\nMax Integer: " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // Overflowing
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // Overflowing the other way, also called Underflow

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max value = " + myMaxByteValue);


        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max value = " + myMaxShortValue);
        
        
        long myLongValue = 100L;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        
        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);


        byte validByteNumber = 34;
        short validShortNumber = 4330;
        int validIntNumber = 50039;
        long validLongNumber = 50000L + 10L * (validByteNumber + validShortNumber + validIntNumber);
        System.out.println(validLongNumber + " Total");

        
    }
}
