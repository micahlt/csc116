import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int QUARTER_VAL = 25, DIME_VAL = 10, NICKEL_VAL = 5, PENNY_VAL = 1;
        int cents, remainingCents, quarters, dimes, nickels, pennies;
        System.out.print("How much money do you need (in cents)? ");
        cents = in.nextInt();
        remainingCents = cents;
        quarters = remainingCents / QUARTER_VAL;
        remainingCents = remainingCents % QUARTER_VAL;
        dimes = remainingCents / DIME_VAL;
        remainingCents = remainingCents % DIME_VAL;
        nickels = remainingCents / NICKEL_VAL;
        remainingCents = remainingCents % NICKEL_VAL;
        pennies = remainingCents / PENNY_VAL;
        remainingCents = remainingCents % PENNY_VAL;
        System.out.println(cents + " cents can be made of " + quarters + " quarters, " + dimes + " dimes, " + nickels
                + " nickels, and " + pennies + " pennies.");
    }
}
