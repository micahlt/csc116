/*
 * This class computes the same formula in four slightly
 * different ways.
 */
class Formula {
    public static double f1(double a, double b, double c) {
        return 3.1 * a * b + 2 * c - (a + c) / 2.2;
    }

    public static double f2(double x, double y, double z) {
        return 3.1 * y * x - (y + z) / 2.2 + 2 * z;
    }

    public static double f3(double m, double t, double q) {
        return 2 * m - (t + m) / 2.2 + 3.1 * t * q;
    }

    public static double f4(double w, double f, double v) {
        return (v + f) / -2.2 + 3.1 * v * w + 2 * f;
    }

    public static void main(String[] args) {
        double y1 = f1(5.6, 6.3, -2.8);
        double y2 = f2(6.3, 5.6, -2.8);
        double y3 = f3(-2.8, 5.6, 6.3);
        double y4 = f4(6.3, -2.8, 5.6);

        System.out.println(y1 + " " + y2 + " " + y3 + " " + y4);
    }
}
