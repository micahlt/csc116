// Test program for digitSum method.

class TestDigitSum {

    public static int digitSum(int digits) {
        digits = Math.abs(digits);
        int sum = 0;
        while (digits > 0) {
            sum += digits % 10;
            digits /= 10;
        }
        return sum;
    }

    public static void testDS(int num) {
        System.out.println("digitSum(" + num + ") = " + digitSum(num));
    }

    public static void main(String[] args) {
        testDS(29107);
        testDS(-456);
        testDS(871);
        testDS(-21);
        testDS(0);
        testDS(2981754);
        testDS(200500);
        testDS(3);
        testDS(-4);
        testDS(59871);
    }
}
