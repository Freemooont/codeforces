import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZoneIds {
    public static void main(String[] args) {

        List<String> a1 = Arrays.asList("a1", "a2", "a3", "b1", "b2", "b3", "a1", "a1", "b2", "b1");
        int a1Count = 0;
        int b1Count = 0;
        List<String> newActivities = new ArrayList<>();
        for (String str: a1) {
            if (str == "a1") {
                if (a1Count != 0) {
                    str = "ar1";
                }
                a1Count++;
            }
            if (str == "b1") {
                if (b1Count != 0) {
                    str = "br1";
                }
                b1Count++;
            }
            newActivities.add(str);
        }

        System.out.println(newActivities);

    }
}
