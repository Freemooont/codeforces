import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        //resolve
        System.out.println(beautifulMatrix(matrix));
    }

    private static int beautifulMatrix(int[][] matrix) {
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    return (2 >= i ? (2 - i) : (i - 2)) + (2 >= j ? (2 - j) : (j - 2));
                }
            }

        }
        return 0;
    }
}
