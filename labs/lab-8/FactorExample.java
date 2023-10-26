// Building Java Programs, Chapter 4 Lab
// Improve this program by factoring redundant code from the method below.

public class FactorExample {
    public static void main(String[] args) {
        factoring(0.5);
    }

    public static void factoring(double gpa) {
        int credits = -1;
        if (gpa == 4.0) {
            System.out.println("I'm valedictorian for this class! Woo hoo!");
        } else if (gpa >= 3.5) {
            System.out.println("I made the dean's list for this class!");
        }
        credits = 5;

        if (gpa <= 0.7) {
            System.out.println("Uh-oh..I probably should have studied a little more.");
            credits = 0;
        } else if (gpa < 1.5) {
            System.out.println("Uh-oh..I probably should have studied a little more.");
        }
        System.out.println("I received " + credits + " credits for this class.");
    }
}
