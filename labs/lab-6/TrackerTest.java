class TrackerTest {
    public static void main(String[] args) {
        // Create three trackers, update them, and print results.
        ScoreTracker tim = new ScoreTracker("Tim");
        ScoreTracker alice = new ScoreTracker("Alice");
        ScoreTracker bill = new ScoreTracker("Bill");

        tim.addResult(98, 100);
        alice.addResult(80, 100);
        bill.addResult(61, 100);

        tim.addResult(58, 70);
        alice.addResult(68, 70);

        tim.addResult(20, 20);
        alice.addResult(20, 20);
        bill.addResult(17, 20);

        alice.addResult(48, 50);
        bill.addResult(37, 50);

        tim.addResult(89, 100);
        alice.addResult(92, 100);

        System.out.println(tim.getNumberOfAssignments() + " " +
                alice.getNumberOfAssignments() + " " +
                bill.getNumberOfAssignments());
        System.out.println(tim.getAverage() + " " + alice.getAverage() + " " +
                bill.getAverage());
        System.out.println();
        System.out.println(tim);
        System.out.println(alice);
        System.out.println(bill);
    }
}
