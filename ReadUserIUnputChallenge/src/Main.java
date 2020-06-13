import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    public static void readNumber() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ": ");
            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt) {
                int numberEntered = sc.nextInt();
                counter++;
                sum += numberEntered;
            } else {
                System.out.println("Invalid Number");
                sc.nextLine(); // handle end of line (enter key)
            }
        }
        sc.close();
        System.out.println("Total sum is : " + sum);
    }

    public static void minAndMaxInputChallenge() {
        Scanner sc = new Scanner(System.in);

        int min = -1, max = -1;
        while (true) {
            System.out.println("Enter number");
            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt) {
                int currentNumber = sc.nextInt();
                if (currentNumber > max) {
                    max = currentNumber;
                }
                if (currentNumber < min || min == -1) {
                    min = currentNumber;
                }
            } else {
                System.out.println("Invalid Value");
                break;
            }
            sc.nextLine();
        }
        System.out.println("Min: " + min + "Max: " + max);
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 0;

        while (true) {
            boolean hasNextInt = sc.hasNextInt();

            if (hasNextInt) {
                int numbers = sc.nextInt();
                sum = sum + numbers;
                count++;
            } else {
                double avg = (double) sum / count;
                System.out.println("SUM = " + (int)sum + " AVG = " + (Math.round(avg)));
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        double bucketsNeeded = (((width*height) / areaPerBucket) - extraBuckets );

        if(extraBuckets<0 || width<=0 || height<=0 || areaPerBucket<=0) {

            return -1;

        } return (int) Math.ceil(bucketsNeeded);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        double bucketsNeeded = (((width*height) / areaPerBucket));

        if(width<=0 || height<=0 || areaPerBucket<=0) {

            return -1;

        } return (int) Math.ceil(bucketsNeeded);

    }

    public static int getBucketCount(double area, double areaPerBucket) {

        double bucketsNeeded = ( area / areaPerBucket);

        if(area<=0 || areaPerBucket<=0) {

            return -1;

        }return (int) Math.ceil(bucketsNeeded);

    }

}
