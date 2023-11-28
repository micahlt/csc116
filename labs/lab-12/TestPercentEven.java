// Test program for percentEven method.

import java.util.Arrays;

class TestPercentEven {

    public static double percentEven(int[] data) {
        int even = 0;
        int total = data.length;
        for (int i : data) {
            if (i % 2 == 0) {
                even++;
            }
        }
        return ((double) even / (double) total) * 100;
    }

    // Run the percentEven method on the given data, and print the result.
    // Then see if the result is equal to soln, and complain if not.
    public static void doTest(int[] data, double soln) {
        double res = percentEven(data);
        System.out.println("percentEven(" + Arrays.toString(data) + ") = " +
                res);

        // Testing doubles for equality is fraught with peril. Better to
        // choose some small value you will accept as close enough, and
        // see if it meets that test.
        if (Math.abs(res - soln) > 0.0001) {
            System.out.println("*** " + res + " should be " + soln + " ***");
        }
    }

    public static void main(String[] args) {
        // Run some tests of precentEven.
        doTest(new int[] { 6, 2, 9, 11, 3 }, 40.0);
        doTest(new int[] { 21 }, 0.0);
        doTest(new int[] { 5, 8, 12, 1, 99, 6, 28, 3 }, 50.0);
        doTest(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 42.8571);
        doTest(new int[] { 4, 11, 21, 7, 19 }, 20.0);
        doTest(new int[] { 3, 4 }, 50.0);
        doTest(new int[] { 22, 8, 12, 42, 2, 6 }, 100.0);
        doTest(new int[] { 3, 7, 19 }, 0.0);
        doTest(new int[] { 30 }, 100.0);
        doTest(new int[] {}, 0.0);
    }
}
