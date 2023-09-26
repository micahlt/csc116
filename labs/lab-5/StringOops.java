import java.util.Scanner;

public class StringOops {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = console.nextLine();
        name = name.replace("a", "e");
        name = name.toUpperCase();
        name = name.substring(0, 3);
        System.out.println(name + " has " + name.length() + " letters");
    }
}