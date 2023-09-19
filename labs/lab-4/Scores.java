import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        int firstLabScore, maxFirstLabScore, secondLabScore, maxSecondLabScore, examScore, maxExamScore;
        Scanner in = new Scanner(System.in);
        print("Please enter the first lab score: ");
        firstLabScore = in.nextInt();
        print("Please enter the maximum first lab score: ");
        maxFirstLabScore = in.nextInt();
        print("Please enter the second lab score: ");
        secondLabScore = in.nextInt();
        print("Please enter the maximum second lab score: ");
        maxSecondLabScore = in.nextInt();
        print("Please enter the exam score: ");
        examScore = in.nextInt();
        print("Please enter the maximum exam score: ");
        maxExamScore = in.nextInt();
        float studentScore = ((float) firstLabScore + (float) secondLabScore + (2 * (float) examScore))
                / ((float) maxFirstLabScore + (float) maxSecondLabScore + (2 * (float) maxExamScore));
        print("Student score is " + studentScore * 100 + "%\n");
    }

    public static void print(String str) {
        System.out.print(str);
    }
}
