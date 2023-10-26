public class IfOops {
    public static void main(String[] args) {
        int a = 7, b = 42;
        int min = minimum(a, b);
        if (min == a) {
            System.out.println("a is the smallest!");
        }
    }

    public static int minimum(int a, int b) { // returns which int is smaller
        int smaller;
        if (a < b) {
            smaller = a;
        } else {
            smaller = b;
        }
        return smaller;
    }
}