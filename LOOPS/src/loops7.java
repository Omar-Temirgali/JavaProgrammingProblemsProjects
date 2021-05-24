import java.util.Scanner;
public class loops7 {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = in.nextInt();
        int max = 0;
        String maxName = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and score of student (" + (i + 1) + "): ");
            String name = in.next();
            int score = in.nextInt();
            if (score > max) {
                max = score;
                maxName = name;
            }
        }
        System.out.println("The student with the highest score is " + maxName);
        System.out.print("The highest score is " + max);
    }
}
