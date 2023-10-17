class Shapes {
    /*
     * The areas of some common shapes.
     */
    static public double ellipseArea(double rad1, double rad2) {
        return Math.PI * rad1 * rad2;
    }

    static public double circleArea(double r) {
        return ellipseArea(r, r);
    }

    static public double rectangleArea(double h, double w) {
        return w * h;
    }

    // Create methods annulusArea, squareArchArea and
    // roundTopArea as instructed. Compute areas using calls to
    // ellipseArea, circleArea, and rectangleArea.

    public static void main(String[] args) {
        System.out.println("Ellipse 1: 5.5 x 7: " + ellipseArea(5.5, 7.0));
        System.out.println("Ellipse 2: 3.3 x 4.4: " + ellipseArea(3.3, 4.4));
        System.out.println("Cirle: 8.3: " + circleArea(8.3));
        System.out.println("Rectangle 1: 5.5 x 7: " + rectangleArea(5.5, 7.0));
        System.out.println("Rectangle 2: 3.3 x 4.4: " +
                rectangleArea(3.3, 4.4));

        System.out.println("Annulus 1: 4.3, 5.8: " + annulusArea(4.3, 5.8));
        System.out.println("Annulus 2: 7, 22.8: " + annulusArea(7, 22.8));
        System.out.println("Annulus 3: 2.9, 3.1: " + annulusArea(2.9, 3.1));

        System.out.println("Sq Arch 1: 14.3, 5.8: " +
                squareArchArea(14.3, 5.8));
        System.out.println("Sq Arch 2: 10.3, 4.8: " +
                squareArchArea(10.3, 4.8));
        System.out.println("Sq Arch 3: 22.9, 3.1: " +
                squareArchArea(22.9, 3.1));
        System.out.println("Rnd Top 1: 4.3, 5.8: " + roundTopArea(4.3, 5.8));
        System.out.println("Rnd Top 2: 10.3, 8.8: " + roundTopArea(10.3, 8.8));
        System.out.println("Rnd Top 3: 2.9, 3.1: " + roundTopArea(2.9, 3.1));

    }

    public static double annulusArea(double smallerRadius, double largerRadius) {
        double innerArea = circleArea(smallerRadius);
        double outerArea = circleArea(largerRadius);
        return outerArea - innerArea;
    }

    public static double squareArchArea(double archHeight, double legWidth) {
        double archTopArea = archHeight * (1.5 * legWidth);
        double archLegArea = ((archHeight - (1.5 * legWidth)) * legWidth);
        return archTopArea + (archLegArea * 2);
    }

    public static double roundTopArea(double baseWidth, double baseHeight) {
        double baseArea = rectangleArea(baseHeight, baseWidth);
        double topArea = ellipseArea(.75 * baseHeight, baseWidth / 2);
        return baseArea + (topArea / 2);
    }
}
