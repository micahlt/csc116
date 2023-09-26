import java.util.Scanner;
import java.util.Random;

public class RandomLet {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String str = in.nextLine();
        int indexToRemove = rand.nextInt(str.length());
        char charToRemove = str.charAt(indexToRemove);
        str = str.substring(0, indexToRemove) + str.substring(indexToRemove + 1);
        System.out.println("Removed '" + charToRemove + "' at position " + indexToRemove + ". String is now:");
        System.out.println(str);
    }
}
