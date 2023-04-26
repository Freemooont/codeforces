import java.util.HashMap;
import java.util.Map;

public class CountConstructString {

    public static void main(String[] args) {
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                                          new String[]{"e", "eeeee", "eeeeeee", "eeeeeeeee", "eeeeeeeeeeee", "eeeeeeeeeeeeeee"}, new HashMap<>()));
        System.out.println(countConstruct("mihai", new String[]{"mi", "hai", "m", "i", "ha", "ihai"}, new HashMap<>()));
    }

    private static int countConstruct(String target, String[] wordBank, Map<String, Integer> memo) {
        if (memo.get(target) != null) {
            return memo.get(target);
        }
        if (target.equals("")) {
            return 1;
        }

        int totalCounter = 0;
        for (String word : wordBank) {
            if (target.indexOf(word) == 0) {
                int numWaysForRest = countConstruct(target.substring(word.length()), wordBank, memo);
                totalCounter += numWaysForRest;
            }
        }
        memo.put(target, totalCounter);
        return totalCounter;
    }
}
