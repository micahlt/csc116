
// Test program for seeMovie method
import java.util.Scanner;

class SeeMovieTest {
    public static void seeMovie(double ticketCost, int rating) {
        if (ticketCost < 5.00) {
            print("Very interested");
        } else if (ticketCost >= 12.00) {
            if (rating == 5) {
                print("Sort of interested");
            } else {
                print("Not interested");
            }
        } else {
            if (rating == 5) {
                print("Very interested");
            } else if (rating >= 2) {
                print("Sort of interested");
            } else {
                print("Not interested");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter movie cost: ");
        double cost = in.nextDouble();
        System.out.print("Enter rating (0-5): ");
        int rating = in.nextInt();

        System.out.print("$" + cost + ", " + rating + " stars: ");
        seeMovie(cost, rating);
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
