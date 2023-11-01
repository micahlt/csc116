public class SmallestPwr2 {
    /*
     * Return the smallest power of two which is greater than or equal to the
     * argument.
     */
    // *** Implement this method ***
    public static int smallestPwr2(int of) {
        int pow = 1;
        while (pow < of) {
            pow *= 2;
        }
        return pow;
    }

    /*
     * Test smallestPwr2, print its result, and complain if the result
     * does not equal shouldBe
     */
    public static void smallestPwr2test(int of, int shouldBe) {
        int ans = smallestPwr2(of);
        System.out.print("Smallest power of two at least " + of + " is " +
                ans);
        if (ans != shouldBe) {
            System.out.print(" //** NOPE! Should be " + shouldBe + " **\\\\");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Make a bunch of tests.
        smallestPwr2test(10, 16);
        smallestPwr2test(100, 128);
        smallestPwr2test(32, 32);
        smallestPwr2test(1, 1);
        smallestPwr2test(3, 4);
        smallestPwr2test(1500, 2048);
        smallestPwr2test(10000, 16384);
        smallestPwr2test(3981729, 4194304);
    }
}
