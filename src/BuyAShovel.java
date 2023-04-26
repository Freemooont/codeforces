import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(resolve(k, r));
    }

    private static int resolve(final int k, final int r) {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if ((k * i) % 10 == 0) {
                return i;
            }
            if ((k * i - r) % 10 == 0) {
                return i;
            }
        }
        return 0;
    }
}
