import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int problems = sc.nextInt();
        sc.nextLine();
        int[][] input = new int[problems][3];

        for (int i = 0 ; i < problems ; i++) {
            for (int j = 0; j < 3 ; j++) {
                input[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        System.out.println(solutions(problems, input));
    }

    private static int solutions(int problems, int[][] input) {
        int solvableProblems = 0;
        for (int i = 0 ; i < problems ; i++) {
            int counter = 0;
            for (int j = 0; j < 3 ; j++) {
                if (input[i][j] == 1 ) {
                    counter++;
                }
            }
            if (counter >= 2) {
                solvableProblems++;
            }
        }
        return solvableProblems;
    }
}
