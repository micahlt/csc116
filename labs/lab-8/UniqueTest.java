// Test program for numUnique
class UniqueTest {
    public static int numUnique(int a, int b, int c) {
        if (a == b && b == c) {
            return 1;
        } else if (a == b || b == c || a == c) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void numUniqueTest(int a, int b, int c) {
        System.out.println("numUnique(" + a + "," + b + "," + c + ") => " + numUnique(a, b, c));
    }

    public static void main(String[] args) {
        numUniqueTest(18, 3, 4);
        numUniqueTest(6, 7, 6);
        numUniqueTest(3, 9, 1);
        numUniqueTest(7, 7, 7);
        numUniqueTest(1, 5, 1);
        numUniqueTest(-4, -4, 2);
        numUniqueTest(9, 3, 1);
        numUniqueTest(-3, 8, 8);
    }
}
