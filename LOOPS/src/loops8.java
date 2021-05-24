import java.util.Scanner;

public class loops8 {
    public static void main(String[] fe) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int max = 0;
        int max2 = 0;
        String maxName = "";
        String maxName2 = "";
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and score of student(" + (i+1) + "): ");
            String name = input.next();
            int score = input.nextInt();
            if (score > max) {
                max2 = max;
                maxName2 = maxName;
                max = score;
                maxName = name;
            } else if (score > max2) {
                max2 = score;
                maxName2 = name;
            }
        }
        System.out.println("The student with the highest score is " + maxName);
        System.out.println("The highest score is " + max);
        System.out.println("The student with the second highest score is " + maxName2);
        System.out.println("The second highest score is " + max2);
    }
}
