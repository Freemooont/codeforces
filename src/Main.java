import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.nextLine();
        String[] words = new String[lines];
        for (int i = 0; i < lines; i++) {
            words[i] = sc.nextLine();
        }

        String[] abbreviated = abbreviate(lines, words);
        for (int i = 0; i < lines; i++) {
            System.out.println(abbreviated[i]);
        }
    }

    private static String[] abbreviate(int lines, String[] words) {
        for (int i = 0; i < lines; i++) {
            char[] chars = words[i].toCharArray();
            if (chars.length <= 10) {
                continue;
            } else {
                String newWord = new StringBuilder().append(chars[0])
                                                    .append(chars.length - 2)
                                                    .append(chars[chars.length - 1])
                                                    .toString();
                words[i] = newWord;
            }
        }
        return words;
    }


}
