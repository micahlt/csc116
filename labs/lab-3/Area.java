/*
 * Request and read the base size and height of a triangle and print its
 * area.
 */

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double base, height;
        System.out.print("Please give the base of the triangle: ");
        base = scan.nextDouble();
        System.out.print("Please give the height of the triangle: ");
        height = scan.nextDouble();

        System.out.println("Traiangle with base " + base + " and height " + height + " has area " + base * height / 2);
        scan.close();
    }
}