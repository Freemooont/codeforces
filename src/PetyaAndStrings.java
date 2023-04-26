import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class PetyaAndStrings {
    public static void main(String[] args) {
        char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Y', 'Z'};
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();

        //resolve
        System.out.println(compareStrings(alpha, string1, string2));
    }

    private static int compareStrings(char[] alpha, String string1, String string2) {
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            if (toLowerCase(chars1[i]) != toLowerCase(chars2[i])) {
                int char1Pos = 0;
                int char2Pos = 0;
                for (int j = 0 ; j < alpha.length; j++) {
                    if (toLowerCase(chars1[i]) == toLowerCase(alpha[j])) {
                        char1Pos += j;
                    }
                    if (toLowerCase(chars2[i]) == toLowerCase(alpha[j])) {
                        char2Pos += j;
                    }
                }
                return char1Pos > char2Pos ? 1 : -1;
            }
        }
        return 0;
    }
}
