public class CounterTest {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.click();
        counter1.click();

        counter2.click();
        counter2.click();
        counter2.click();

        System.out.println(counter1.getCount() + ", " + counter2.getCount());

        counter2.reset();
        System.out.println(counter2.getCount());
    }
}
