import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringTask {
    /*https://codeforces.com/problemset/problem/118/A*/

    private static Map<String, String> letters = new HashMap<>();

    public static void main(String[] args) {
        letters.put("A",".");
        letters.put("B",".");
        letters.put("C",".");
        letters.put("D",".");
        letters.put("E",".");
        letters.put("F",".");
        letters.put("G",".");
        letters.put("H",".");
        letters.put("I",".");
        letters.put("J",".");
        letters.put("K",".");
        letters.put("L",".");
        letters.put("M",".");
        letters.put("N",".");
        letters.put("O",".");
        letters.put("P",".");
        letters.put("Q",".");
        letters.put("R",".");
        letters.put("S",".");
        letters.put("T",".");
        letters.put("U",".");
        letters.put("V",".");
        letters.put("W",".");
        letters.put("X",".");
        letters.put("Y",".");
        letters.put("Z",".");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(resolve(s));
    }

    private static String resolve(final String s) {

        return null;
    }
}
