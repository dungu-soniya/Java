package resultprogram;

import java.util.Scanner;

class ResultCard {

    private int id;
    private String name;
    private int[] scores;

    ResultCard(int id, String name, int[] scores) {
        this.id = id;
        this.name = name;
        this.scores = scores;
    }

    int totalScore() {
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        return sum;
    }

    double averageScore() {
        return totalScore() / (double) scores.length;
    }

    int maximumScore() {
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        return max;
    }

    int minimumScore() {
        int min = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        return min;
    }

    String findGrade() {

        double average = averageScore();

        if (average >= 90)
            return "A+";
        else if (average >= 80)
            return "A";
        else if (average >= 70)
            return "B";
        else if (average >= 60)
            return "C";
        else if (average >= 50)
            return "D";
        else
            return "F";
    }

    boolean isPassed() {

        for (int score : scores) {
            if (score < 35) {
                return false;
            }
        }

        return true;
    }

    String performanceLevel() {

        double average = averageScore();

        if (average >= 90)
            return "Excellent";
        else if (average >= 75)
            return "Very Good";
        else if (average >= 60)
            return "Good";
        else if (average >= 50)
            return "Average";
        else
            return "Needs Improvement";
    }

    void printReport() {

        String student = name.strip();

        System.out.println("\n===== RESULT CARD =====");
        System.out.println("Student ID    : " + id);
        System.out.println("Name          : " + student);
        System.out.println("Subjects      : " + scores.length);

        System.out.println("\nSubject Scores");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Subject " + (i + 1) + "     : " + scores[i]);
        }

        double avg = averageScore();
        double roundedAvg = Math.round(avg * 100.0) / 100.0;

        System.out.println("\nTotal         : " + totalScore());
        System.out.println("Average       : " + roundedAvg);
        System.out.println("Highest       : " + maximumScore());
        System.out.println("Lowest        : " + minimumScore());
        System.out.println("Grade         : " + findGrade());
        System.out.println("Status        : " +
                (isPassed() ? "PASSED" : "FAILED"));
        System.out.println("Performance   : " + performanceLevel());
    }
}

public class StudentResult {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        int subjectCount = 5;
        int[] scores = new int[subjectCount];

        System.out.println("\nEnter marks:");

        for (int i = 0; i < subjectCount; i++) {

            System.out.print("Enter marks for Subject "
                    + (i + 1) + ": ");

            scores[i] = input.nextInt();
        }

        ResultCard card = new ResultCard(id, name, scores);

        card.printReport();

        input.close();
    }
}
Enter Student ID: 205
Enter Student Name: Priya Reddy

Enter marks:
Enter marks for Subject 1: 91
Enter marks for Subject 2: 84
Enter marks for Subject 3: 79
Enter marks for Subject 4: 88
Enter marks for Subject 5: 93

===== RESULT CARD =====
Student ID    : 205
Name          : Priya Reddy
Subjects      : 5

Subject Scores
Subject 1     : 91
Subject 2     : 84
Subject 3     : 79
Subject 4     : 88
Subject 5     : 93

Total         : 435
Average       : 87.0
Highest       : 93
Lowest        : 79
Grade         : A
Status        : PASSED
Performance   : Very Good
