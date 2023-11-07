/*
Building Java Programs, Lab, Chapter 8

This client program uses Point objects.
Expected output:

p1 (81, 21) quadrant = 1
p2 (-52, 32) quadrant = 2
p3 (-93, -13) quadrant = 3
p4 (64, -44) quadrant = 4
p0 (0, 0) quadrant = 0

p1 after flip = (-21, -81)
p2 after flip = (-32, 52)
p3 after flip = (13, 93)
p4 after flip = (44, -64)
p0 after flip = (0, 0)
*/

public class PointMain {
    public static void testCompareTo(Point a, Point b) {
        System.out.println(a + " < " + b + " => " + (a.compareTo(b) < 0));
        System.out.println(a + " == " + b + " => " + (a.compareTo(b) == 0));
        System.out.println(a + " > " + b + " => " + (a.compareTo(b) > 0));
        System.out.println(b + " < " + a + " => " + (b.compareTo(a) < 0));
        System.out.println(b + " == " + a + " => " + (b.compareTo(a) == 0));
        System.out.println(b + " > " + a + " => " + (b.compareTo(a) > 0));
    }

    public static void main(String[] args) {
        Point p1 = new Point(18, 21);
        Point p2 = new Point(-52, 32);
        Point p3 = new Point(-93, -13);
        Point p4 = new Point(64, -44);
        Point p5 = new Point(64, 10);
        Point p6 = new Point(-52, 32);
        Point p0 = new Point(0, 0);

        testCompareTo(p1, p2); // F, F, T, T, F, F
        testCompareTo(p5, p4); // F, F, T, T, F, F
        testCompareTo(p2, p6); // F, T, F, F, T, F
        System.out.println();

        System.out.println("p1 " + p1 + " quadrant = " + p1.quadrant());
        System.out.println("p2 " + p2 + " quadrant = " + p2.quadrant());
        System.out.println("p3 " + p3 + " quadrant = " + p3.quadrant());
        System.out.println("p4 " + p4 + " quadrant = " + p4.quadrant());
        System.out.println("p0 " + p0 + " quadrant = " + p0.quadrant());
        System.out.println();

        p1.flip();
        System.out.println("p1 after flip = " + p1);
        p2.flip();
        System.out.println("p2 after flip = " + p2);
        p3.flip();
        System.out.println("p3 after flip = " + p3);
        p4.flip();
        System.out.println("p4 after flip = " + p4);
        p0.flip();
        System.out.println("p0 after flip = " + p0);

    }
}
