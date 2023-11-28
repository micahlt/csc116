// Test program for copyRange method.

import java.util.Arrays;

class TestCopyRange {

    public static void copyRange(int[] from, int[] to, int iFrom, int iTo, int length) {
        for (int i = 0; i < length; i++) {
            to[i + iTo] = from[i + iFrom];
        }
    }

    // Run copyRange on the arguments given to us (except result), then
    // see if the value of to changed to be the same as result. The
    // arguments and new value of to are printed in any case, and a message
    // if the modifed to does not match the sent result.
    public static void doTest(int[] from, int[] to,
            int iFrom, int iTo, int leng,
            int[] result) {
        // Print inbound parms (except result).
        System.out.println("copyRange(" + Arrays.toString(from) + ",\n  " +
                Arrays.toString(to) + "," + iFrom + "," + iTo + "," + leng + ")");

        // Test copyRange
        copyRange(from, to, iFrom, iTo, leng);

        // Print modified to, and complain if not as required.
        System.out.println("    => " + Arrays.toString(to));
        if (!Arrays.equals(to, result)) {
            System.out.println("*** Incorrect ***");
        }
    }

    public static void main(String[] args) {
        // This is the example given in the instructions.
        int[] a1 = { 10, 20, 30, 40, 50, 60 };
        int[] a2 = { 91, 92, 93, 94, 95, 96 };
        doTest(a1, a2, 0, 2, 3,
                new int[] { 91, 92, 10, 20, 30, 96 });

        // Other tests.
        int[] arr1 = new int[20];
        doTest(new int[] { 3, 18, 9, 22, 41, 30, 17, 8, 22, 99,
                12, 8, 22, 19, 4, 42, 11, 18, 39, 45 },
                arr1, 0, 0, 20, arr1);
        int[] arr2 = { 4, 9, 8, 3, 11, 17 };
        doTest(arr2, arr1, 1, 7, 4,
                new int[] { 3, 18, 9, 22, 41, 30, 17, 9, 8, 3,
                        11, 8, 22, 19, 4, 42, 11, 18, 39, 45 });
        doTest(arr2, arr1, 1, 0, 2,
                new int[] { 9, 8, 9, 22, 41, 30, 17, 9, 8, 3,
                        11, 8, 22, 19, 4, 42, 11, 18, 39, 45 });
        doTest(a1, arr1, 3, 17, 3,
                new int[] { 9, 8, 9, 22, 41, 30, 17, 9, 8, 3,
                        11, 8, 22, 19, 4, 42, 11, 40, 50, 60 });

        // Zero is a perfectly good size, especially when you don't
        // actually want to do anything.
        doTest(a1, a2, 3, 2, 0, a2);
    }
}
