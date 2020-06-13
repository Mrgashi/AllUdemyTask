public class Main {
    public static void main(String[] args) {
        printSquareStar(15);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            String star = "*";
            String space = " ";

            for (int i = 1; i <= number; i++) {
                if (i == 1 || i == number) {
                    int x = 0;
                    while (x < number) {
                        System.out.print(star);
                        x++;
                    }
                    System.out.println();
                }

                if (i > 1 && i < number) {
                    for (int j = 1; j <= number; j++) {
                        if (j == i || j == number - i + 1 || j == 1 || j == number) {
                            System.out.print(star);
                        } else {
                            System.out.print(space);
                        }
                    }
                    System.out.println();
                }
            }

        }
    }
}
