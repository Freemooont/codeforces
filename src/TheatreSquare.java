import java.util.Scanner;

public class TheatreSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, m, a;
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();

        //resolve

        System.out.println(calculte(n, m, a));
    }

    private static long calculte(final long n, final long m, final long a) {
        return (n / a + (n % a != 0 ? 1 : 0)) * ((m / a + (m % a != 0 ? 1 : 0)));
    }
}