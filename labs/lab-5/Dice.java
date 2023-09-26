import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;
        System.out.println("Roll " + roll1 + " and " + roll2 + " is " + (roll1 + roll2));
    }
}
