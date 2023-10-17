import java.util.*;

class NameTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Request the first name
        System.out.print("Please enter a name, First Middle Last: ");
        String f = scan.next();
        String m = scan.next();
        String l = scan.next();
        Name name1 = new Name(f, m, l);

        // Run all the methods.
        System.out.println("Each part: " + name1.getFirst() + " " +
                name1.getMiddle() + " " + name1.getLast());
        System.out.println("FML: " + name1.firstMiddleLast());
        System.out.println("LFM: " + name1.lastFirstMiddle());
        System.out.println("Initials: " + name1.initials());
        System.out.println("Length: " + name1.length());
        System.out.println();
        System.out.print("Enter a second name for compare test, " +
                "First Middle Last: ");
        f = scan.next();
        m = scan.next();
        l = scan.next();
        Name name2 = new Name(f, m, l);
        System.out.println(name1.firstMiddleLast() + " same as " +
                name2.firstMiddleLast() + ": " +
                name1.equals(name2));
        System.out.println(name2.firstMiddleLast() + " same as " +
                name1.firstMiddleLast() + ": " +
                name2.equals(name1));
        System.out.println("(Of course, comparson each way should give " +
                "the same result.)");
    }
}
