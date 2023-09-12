import java.util.Scanner;

public class Payoff {
    public static void main(String[] args) {
        double payment, bonus, leaderTotal, memberTotal;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the payment amount: ");
        payment = scan.nextDouble();
        System.out.print("Please enter the leader bonus: ");
        bonus = scan.nextDouble();
        payment -= bonus;
        memberTotal = payment / 3;
        leaderTotal = memberTotal + bonus;
        System.out.println("Leader gets $" + leaderTotal + ", others get $" + memberTotal);
        scan.close();
    }
}
