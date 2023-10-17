import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String myStr = in.nextLine(), reversed = "";
        String[] stringArr = myStr.split("");
        for (int i = stringArr.length; i > 0; i--) {
            reversed += stringArr[i - 1];
        }
        reversed = reversed.toLowerCase();
        System.out.println(reversed);
    }
}
