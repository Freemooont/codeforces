import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        String s = sc.nextLine();

        //resolve

        System.out.println(count(s.toCharArray()));

    }

    private static int count(char[] s) {
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if (i == s.length - 1) {
                return counter;
            }
            if (s[i] == s[i + 1]) {
                counter++;
            }
        }
        return counter;
    }
}
