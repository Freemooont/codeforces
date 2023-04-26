import java.util.ArrayList;
import java.util.List;

public class SumOfTwo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {10, 20, 30, 40};
        int v = 42;

        sumOfTwo(a, b, v);
    }

    private static boolean sumOfTwo(final int[] a, final int[] b, final int v) {
        List<String> dom = new ArrayList<>();
        dom.add("domain.com");

        List<String> dom2 = new ArrayList<>();
        dom.add("domain.com");

        dom.removeAll(dom2);

        dom.forEach(System.out::println);
        return true;
    }
}
