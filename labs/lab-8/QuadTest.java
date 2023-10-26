// Test program for quadrant method
class QuadTest {
    public static int quadrant(double x, double y) {
        if (x >= 0 && y >= 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void quadrantTest(double x, double y) {
        int q = quadrant(x, y);
        System.out.println("quadrant(" + x + "," + y + ") => " + q);
    }

    public static void main(String[] args) {
        quadrantTest(-2.3, 14.2);
        quadrantTest(3.51, -9.8);
        quadrantTest(0.0, 0.);
        quadrantTest(0.0, 2.91);
        quadrantTest(-0.3, -4.44);
        quadrantTest(4.8, 0.0);
        quadrantTest(-8.13, 2.0);
        quadrantTest(4.5, 6.1);
        quadrantTest(-3.8, 0.0);
        quadrantTest(0.0, -3.81);
    }
}
