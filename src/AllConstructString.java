public class AllConstructString {

    public static void main(String[] args) {

    }

    private static String[][] allConstruct(String target, String[] wordBank) {
        if (target.equals("")) {
            return new String[][]{};
        }

        for (String word : wordBank) {
            if (target.indexOf(word) == 0) {

            }
        }
        return null;
    }
}
