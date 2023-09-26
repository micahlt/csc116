import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");

        String name = console.nextLine();

        final int spaceIndex = name.indexOf(" ");

        final char firstInitial = name.charAt(0);

        final String lastName = name.substring(spaceIndex + 1);

        name = lastName + ", " + firstInitial;

        System.out.println("Your name is: " + name + ".");
    }
}