import java.util.Scanner;

public class Games {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        //resolve
        System.out.println(games(matrix, n));
    }

    private static int games(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                if (matrix[i][j] == 1) {
                    return (2 >= i ? (2 - i) : (i - 2)) + (2 >= j ? (2 - j) : (j - 2));
                }
            }

        }
        return 0;

    }

}
