import java.util.*; // for Scanner

// Solution for simple string exercise in ch03-strings and ch03-strings_noc

public class ProcessName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String name = "";
        int spaceloc = -1;
        System.out.print("Type your name: ");
        name = console.nextLine();
        spaceloc = name.indexOf(' ');
        while (name.length() < 5 || spaceloc < 0) {
            System.out.print("Error, must be at least 5 chars with a space.\nType your name: ");
            name = console.nextLine();
            spaceloc = name.indexOf(' ');
        }
        name = name.substring(spaceloc + 1) + ", " + name.substring(0, 1);

        System.out.println("Your name is: " + name);
    }
}
