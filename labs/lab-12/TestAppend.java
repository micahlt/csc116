// Test program for append method.

import java.util.Arrays;

class TestAppend {

    public static int[] append(int[] a, int[] b) {
        int totalLength = a.length + b.length;
        int[] newArray = new int[totalLength];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        for (int i = a.length; i < totalLength; i++) {
            newArray[i] = b[i - a.length];
        }
        return newArray;
    }

    public static void doTest(int[] a, int[] b, int[] result) {
        // Actually run the method being tested.
        int[] res = append(a, b);

        // If there's a lot of array, use some newlines, otherwise don't
        String sep = (a.length + b.length < 10 ? " " : "\n  ");

        // Print results.
        System.out.println("append(" + Arrays.toString(a) + "," + sep +
                Arrays.toString(b) + ") =>" + sep +
                Arrays.toString(res) + ")");

        // Check against standard sent by caller.
        if (!Arrays.equals(res, result)) {
            System.out.println("*** Incorrect ***");
        }
    }

    public static void main(String[] args) {
        int[] a1 = { 10, 20, 30, 40, 50, 60 };
        int[] a2 = { 91, 92, 93, 94, 95, 96 };
        doTest(a1, a2,
                new int[] { 10, 20, 30, 40, 50, 60, 91, 92, 93, 94, 95, 96 });

        int[] arr1 = { 3, 18, 9, 22, 41, 30, 17, 8, 22, 99,
                12, 8, 22, 19, 4, 42, 11, 18, 39, 45 };
        int[] arr2 = { 4, 9, 8, 3, 11, 17 };
        doTest(arr1, arr2,
                new int[] { 3, 18, 9, 22, 41, 30, 17, 8, 22, 99,
                        12, 8, 22, 19, 4, 42, 11, 18, 39, 45,
                        4, 9, 8, 3, 11, 17 });
        int[] empty = {};
        doTest(arr2, empty, arr2);
        doTest(empty, a2, a2);
        doTest(empty, empty, empty);
        doTest(new int[] { 42 }, arr2, new int[] { 42, 4, 9, 8, 3, 11, 17 });
        doTest(a1, new int[] { 77 }, new int[] { 10, 20, 30, 40, 50, 60, 77 });
    }
}
