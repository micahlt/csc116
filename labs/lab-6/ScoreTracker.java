/*
 * This class keeps track of the average score for a single student.
 */
class ScoreTracker {
    // The name of the student.
    private String studentName;

    /*
     * You need to keep running totals: The number of assignments, the
     * total points possible, and the actual points earned.
     */
    private int numAssignments = 0;
    private int pointsPossible = 0;
    private int pointsEarned = 0;

    /*
     * The constructor accepts and stores the name of the student.
     */
    // *** Implement the constructor ***
    public ScoreTracker(String name) {
        // This should be a single assignment statement. The constructor
        // just stores the parameter (name) into the object variable
        // studentName. Most constructors do something this simple.
        studentName = name;
    }

    /*
     * Add the result of a new assignment to the accumulation
     */
    // *** Implement this method ***
    public void addResult(int earned, int possible) {
        // This method should update the object variables numAssignments,
        // pointsPossible and pointsEarned to include an additional
        // assignment.
        numAssignments++;
        pointsPossible += possible;
        pointsEarned += earned;
    }

    /*
     * Return the number of assignments completed.
     */
    // *** Implement this method ***
    public int getNumberOfAssignments() {
        // The return statement is here only to make this code compile.
        // It is not correct. Instead of zero, return the correct value.
        return numAssignments;
    }

    /*
     * Return the current average as a percentage of possible points earned.
     */
    // *** Implement this method ***
    public double getAverage() {
        // This computes the percentage of possible points that have been
        // earned, and returns it. Pay attention to the types involved.
        // The existing return is present only to satisfy the compiler.
        // Replace it with a correct one.
        return ((double) pointsEarned / (double) pointsPossible) * 100;
    }

    /*
     * Return a string for printing purposes. It looks like this:
     * Name: pct over nn assignments
     * With the student's actual name, earned percentage, and number of
     * project substituted for Name, pct and nn, respecitively.
     */
    // *** Implement this method ***
    public String toString() {
        // Replace the return statement with one that builds the string
        // described above. Concatenate the students name, percentage,
        // and assignment count along with some string constants to build
        // the specified return string.
        return studentName + ": " + getAverage() + " over " + numAssignments + " assignments";
    }
}
