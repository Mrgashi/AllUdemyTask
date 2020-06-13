public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        int x  = bigCount * 5;
        int y = smallCount * 1;

        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (x + y < goal) {
            return false;
        }

        if (x + y == goal) {
            return true;
        }

        if (x  > goal) {
            bigCount = bigCount - 1;
            int sum = (bigCount * 5) + y;
            if(sum < goal) {
                return false;
            }
        }
        return true;
    }
}
