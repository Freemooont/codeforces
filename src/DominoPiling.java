import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        //resolve

        System.out.println(resolveDomino(m, n));
    }

    private static int resolveDomino(int m, int n) {

        if (m % 2 == 0) {
            return m/2*n;
        } else {
            return m/2*n + (n/2);
        }
    }
}
