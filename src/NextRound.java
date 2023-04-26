import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] results = new int[n];
        sc.nextLine();
        for (int i=0; i < n; i++) {
            results[i] = sc.nextInt();
        }

        //resolve
        System.out.println(winnersCount(n, k, results));;
    }

    private static int winnersCount(int n, int k, int[] results) {
        int counter = 0;
        for (int i = 0; i < n ; i ++) {
            if (results[i] == 0) {
                continue;
            }
            if (results[i] >= results[k-1]) {
                counter++;
            }
        }
        return counter;
    }
}
