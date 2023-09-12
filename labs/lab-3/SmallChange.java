import java.util.Scanner;

public class SmallChange {
    // -----------------------------------------------------------------
    // Calculates the total of coin values
    // -----------------------------------------------------------------
    public static void main(String[] args) {
        int quarters, dimes, nickels, totalCents, totalDollars, remainingCents;

        Scanner scan = new Scanner(System.in);

        System.out.print("How many quarters? ");
        quarters = scan.nextInt();
        System.out.print("How many dimes? ");
        dimes = scan.nextInt();
        System.out.print("How many nickels? ");
        nickels = scan.nextInt();
        totalCents = quarters * 25 + dimes * 10 + nickels * 5;
        totalDollars = totalCents / 100;
        remainingCents = totalCents % 100;
        System.out.println("You have " + totalDollars + " dollars and " + remainingCents + " cents.");
        scan.close();
    }
}
