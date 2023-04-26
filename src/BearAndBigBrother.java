import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(reoslve(a, b));
    }

    private static int reoslve(int a, int b) {

        for (int i = 1 ; i < 100 ; i++) {
            a *= 3;
            b *= 2;
            if (a > b){
                return i;
            }
        }
        return 0;
    }
}
