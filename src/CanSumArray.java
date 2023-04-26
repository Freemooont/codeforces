import java.util.Locale;

public class CanSumArray {
    public static void main(String[] args) {
        //System.out.println(canSum(8, new int[]{3, 3, 3, 3, 4}));
        Locale locale = new Locale("en","DE");
        System.out.println(locale.getDisplayCountry());
    }

    private static boolean canSum(int target, int[] values) {
        if (target == 0) {
            return true;
        }
        for (int i : values) {
            var sol = target -= i;
            if (sol > 0) {
                canSum(sol, values);
            }
        }
        return false;
    }
}
