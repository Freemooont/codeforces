import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long n = sc.nextInt();
        int w = sc.nextInt();

        //resolve
        System.out.println(resolve(k, w, n));;
    }

    private static long resolve(final int k, final int w, final long n) {
        int totalCost = 0;
        for (int i = 1; i <= w; i++) {
            totalCost += i * k;
        }
        return totalCost > n ? totalCost - n : 0;
    }
}
