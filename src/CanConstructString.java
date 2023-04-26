import java.util.HashMap;
import java.util.Map;

public class CanConstructString {

    public static void main(String[] args) {

        System.out.println(canConstruct("mihai",
                                        new String[]{"mi", "hai", "m", "i", "ha"}, new HashMap<>()));
    }

    private static boolean canConstruct(String target, String[] wordBank, Map<String, Boolean> memo) {
        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        if (target.equals("")) {
            return true;
        }

        for (String word : wordBank) {
            if (target.indexOf(word) == 0) {
                var suffix = target.substring(word.length());

                if (canConstruct(suffix, wordBank, memo)) {
                    memo.put(target, true);
                    return true;
                }
            }
        }
        memo.put(target, false);
        return false;
    }
}
