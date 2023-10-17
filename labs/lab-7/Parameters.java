public class Parameters {
    private static double bubble = 867.5309;

    public static void main(String[] args) {
        double x = 10.01;
        double y = 0;

        printer(x, y);
    }

    public static void printer(double x, double y) {
        int z = 5;
        System.out.println("x = " + x + " and y = " + y);
        System.out.println("The value from main is: " + bubble);
    }
}