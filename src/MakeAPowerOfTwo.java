import java.util.Scanner;

public class MakeAPowerOfTwo {
    public static void main(String[] args) {

            System.out.println("Form of instrument was of unexpected type '%s'");

        /*Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] n = {};
        for(int i = 0 ; i < t ; i++) {
            n[i] = sc.nextLine();
        }*/
        //resolve

    }

    private static void resolve(int t, String[] n) {
        for(int i = 0 ; i < t; i++) {
            makeAPowerOfTwo(n[i]);
        }
    }

    private static String makeAPowerOfTwo(String n) {
        if (isAPerfectSquare(Integer.parseInt(n))) {
            return n;
        } else {

        }
        return "0";
    }

    private static boolean isAPerfectSquare(final int n) {
        int square = (int) Math.sqrt(n);
        return square * square == n;
    }

    private static int toInt(String number) {
        return Integer.parseInt(number);
    }

    private static char[] toCharArray(String number) {
        return number.toCharArray();
    }

}



/// 8888