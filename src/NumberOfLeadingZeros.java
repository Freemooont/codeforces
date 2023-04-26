public class NumberOfLeadingZeros {
    public static void main(String[] args) {
        System.out.println(numberOfLeadingZeros(1));
    }

    public static int numberOfLeadingZeros(int i) {
        if (i <= 0) {
            return i == 0 ? 32 : 0;
        } else {
            int n = 31;
            if (i >= 65536) {
                n -= 16;
                i >>>= 16;
            }

            if (i >= 256) {
                n -= 8;
                i >>>= 8;
            }

            if (i >= 16) {
                n -= 4;
                i >>>= 4;
            }

            if (i >= 4) {
                n -= 2;
                i >>>= 2;
            }

            return n - (i >>> 1);
        }
    }
}
