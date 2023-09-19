import java.util.Scanner;

public class Poly {
    public static void main(String[] args) {
        double A, B, C, x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three coefficients and an x-value.");
        System.out.print("A: ");
        A = input.nextDouble();
        System.out.print("B: ");
        B = input.nextDouble();
        System.out.print("C: ");
        C = input.nextDouble();
        System.out.print("x-value: ");
        x = input.nextDouble();
        y = A * Math.pow(x, 2) + B * x + C;
        System.out.print(A + "x^2 + " + B + "x + " + C + " = " + y);
        System.out.println(", when x = " + x);
    }
}
