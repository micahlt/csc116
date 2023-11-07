class TestRectangle {
    public static void cornertest(Rectangle r,
            Point ul, Point ur, Point ll, Point lr) {
        System.out.println(r + ": " + r.getUpLeft() + " " + r.getUpRight()
                + " " + r.getLowLeft() + " " + r.getLowRight());
        if (r.getUpLeft().compareTo(ul) != 0)
            System.out.println("Upper left should be " + ul);
        if (r.getUpRight().compareTo(ur) != 0)
            System.out.println("Upper left should be " + ur);
        if (r.getLowLeft().compareTo(ll) != 0)
            System.out.println("Upper left should be " + ll);
        if (r.getUpRight().compareTo(ur) != 0)
            System.out.println("Upper left should be " + ur);
    }

    public static void inorout(Rectangle r, int x, int y, boolean should) {
        boolean is1 = r.contains(x, y);
        Point p = new Point(x, y);
        boolean is2 = r.contains(p);
        System.out.print(r + ".contains(" + x + "," + y + "): " + is1 + " ");
        System.out.print(r + ".contains(" + p + "): " + is2 + " ");
        if (is1 != should || is2 != should) {
            System.out.print("  Ooops.");
        }
        System.out.println();
    }

    public static void overtest(Rectangle r1, Rectangle r2, boolean result) {
        boolean ores1 = r1.overlap(r2);
        boolean ores2 = r2.overlap(r1);

        System.out.print(r1 + " overlapping " + r2 + ": ");
        if (ores1 != ores2) {
            System.out.println("Directions differ.  Should both be " + result);
        } else if (ores1 == result) {
            System.out.println(ores1 + " (okay)");
        } else {
            System.out.println("Got " + ores1 + ", should be " + result);
        }
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(3, 2, 5, 8);
        Rectangle rect2 = new Rectangle(6, 5, 7, 10);
        Rectangle rect3 = new Rectangle(11, 9, 3, 3);
        Rectangle rect4 = new Rectangle(10, 3, 5, 8);
        Rectangle rect5 = new Rectangle(6, 16, 1, 1);

        System.out.println(rect1 + ": x = " + rect1.getX() + " "
                + ": y = " + rect1.getY() + " "
                + ": width = " + rect1.getWidth() + " "
                + ": height = " + rect1.getHeight());

        System.out.println(rect4 + ": x = " + rect4.getX() + " "
                + ": y = " + rect4.getY() + " "
                + ": width = " + rect4.getWidth() + " "
                + ": height = " + rect4.getHeight());

        System.out.println();

        cornertest(rect1, new Point(3, 2), new Point(8, 2),
                new Point(3, 10), new Point(8, 10));
        cornertest(rect4, new Point(10, 3), new Point(15, 3),
                new Point(10, 11), new Point(15, 11));
        System.out.println();

        inorout(rect1, 4, 5, true);
        inorout(rect1, 3, 2, true);
        inorout(rect1, 6, 7, true);
        inorout(rect1, 2, 6, false);
        inorout(rect1, 3, 1, false);
        inorout(rect1, 1, 1, false);
        inorout(rect1, 9, 11, false);
        inorout(rect1, 8, 10, true);
        inorout(rect1, 8, 11, false);
        inorout(rect1, 9, 10, false);
        System.out.println();

        inorout(rect5, 6, 16, true);
        inorout(rect5, 7, 17, true);
        inorout(rect5, 6, 17, true);
        inorout(rect5, 7, 16, true);
        inorout(rect5, 1, 3, false);
        System.out.println();

        overtest(rect1, rect2, true);
        overtest(rect1, rect3, false);
        overtest(rect1, rect4, false);
        overtest(rect2, rect3, true);
        System.out.println();

    }
}
