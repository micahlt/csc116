import java.util.*;

/*** Replace comments having stars like the code described. ***/
class Guess {
    public static void main(String args[]) {
        // We'll be needing a scanner.
        Scanner scan = new Scanner(System.in);

        // Choose a random integer from 1 to 20 for the user to guess.
        Random r = new Random();
        int toGuess = r.nextInt(1, 20);

        System.out.println("I'm thinking of a number between 1 and 20. " +
                "Can you guess it in four?");

        // Now, allow 4 guesses. Also set the guess outside the correct
        // range so it can't be right; user will have to enter a guess to
        // it it right!
        int guessesLeft = 4;
        int guess = -1;
        while (guess != toGuess && guessesLeft > 0) {
            System.out.print("What is your guess? ");
            guess = scan.nextInt();

            guessesLeft--;

            if (guess < toGuess) {
                System.out.print("Your guess is too small. ");
            } else {
                System.out.print("Your guess is too large. ");
            }
            System.out.println(guessesLeft + " left.");
        }

        if (guess == toGuess) {
            System.out.println("Congratulations! " + guess + " is correct.");
        } else {
            System.out.println("Sorry. The number was " + toGuess + ".");
        }
    }
}
