import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        System.out.println(reoslve(y + 1));
    }

    private static int reoslve(int y) {
        String s = String.valueOf(y);
        char[] chars = s.toCharArray();
        for(int i = 0; i < 3; i++) {
            for (int j = i + 1 ; j < 4 ; j++) {
                if (chars[i] == chars[j]) {
                    return reoslve(y+1);
                }
            }
        }
        return y;
    }
}
