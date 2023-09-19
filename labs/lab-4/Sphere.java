import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of your sphere: ");
        double radius = input.nextDouble();
        double volume = (Math.PI * Math.pow(radius, 3)) * 4 / 3;
        System.out.println("The volume of a sphere with radius " + radius + " is " + volume);
    }
}
