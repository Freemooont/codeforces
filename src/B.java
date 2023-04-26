import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] statements = new String[n];

        sc.nextLine();
        for (int i=0; i < n; i++) {
            statements[i] = sc.nextLine();
        }

        //resolve
        System.out.println(executeB(statements));
    }

    private static int executeB(String[] statements) {
        int result = 0;
        for (String statement : statements) {
            if (statement.contains("+")) {
                result++;
            } else {
                result--;
            }

        }
        return result;
    }


}
