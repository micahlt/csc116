import java.util.Random;

public class MyTest {
    public static void main(String[] args) {
        int i = 20;
        int j = 1;
        while (i > 0) {
            i = i / 2;
            ++j;
        }
        System.out.println(j);
    }
}