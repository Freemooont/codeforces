import java.util.Scanner;

public class HelpfulMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expresion = sc.nextLine();

        //resolve
        char[] chars = expresion.toCharArray();

        System.out.println(sort(chars));
    }

    private static String sort(char[] chars) {
        for (int i = 0; i< chars.length; i +=2) {
            char key = chars[i];
            int j = i - 2;

            while (j >= 0 && chars[j] > key) {
                chars[j + 2] = chars[j];
                j = j - 2;
            }
            chars[j + 2] = key;
        }
        return  new String(chars);
    }
}
