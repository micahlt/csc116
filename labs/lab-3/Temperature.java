import java.util.Scanner;

public class Temperature {
    // -----------------------------------------------------------------
    // Calculates temperature conversions from user input
    // -----------------------------------------------------------------
    public static void main(String[] args) {
        double fahrenheit, celsius, kelvin;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = scan.nextDouble();

        celsius = (fahrenheit - 32) / 1.8;
        kelvin = celsius + 273.15;

        System.out.println("|\n|  Celsius: " + celsius);
        System.out.println("|  Kelvin: " + kelvin + "\n|");
        scan.close();
    }
}
