import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = in.nextInt();
        System.out.print("Enter " + n + " scores: ");
        int[] scores = new int[n];
        int bestscore = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = in.nextInt();
            if (bestscore < scores[i]) {
                bestscore = scores[i];
            }
        }
        char grade;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= bestscore - 10)
                grade = 'A';
            else if (scores[i] >= bestscore - 20)
                grade = 'B';
            else if (scores[i] >= bestscore - 30)
                grade = 'C';
            else if (scores[i] >= bestscore - 40)
                grade = 'D';
            else
                grade = 'F';
            System.out.println("Student " + i +": score is " + scores[i] +" and grade is " + grade);
        }
        Quiz quiz = new Quiz();
        quiz.getQuestions();
    }
}
