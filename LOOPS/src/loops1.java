import javax.sound.midi.Soundbank;
import java.util.*;
public class loops1 {
    public static void main(String[] args) {
        final int num_of_questions = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        Scanner in = new Scanner(System.in);
        while (count < num_of_questions) {
            int num1 = (int)(Math.random() * 15 + 1);
            int num2 = (int)(Math.random() * 15 + 1);

            if (num1 < num2) {
                int temp = num1;
                num1 =  num2;
                num2 = temp;
            }

            System.out.print("What is " + num1 + " - " + num2 + " ? ");
            int answer = in.nextInt();

            if (num1 - num2 == answer) {
                System.out.println("You are correct");
                correctCount++;
            }
            else {
                System.out.println("Your answer is wrong. \n" + num1 + " - " + num2 + " should be " + (num1 - num2));
            }
            count++;
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000);
    }
}
