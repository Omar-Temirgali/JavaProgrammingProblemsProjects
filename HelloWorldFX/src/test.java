import java.util.Scanner;

public class test {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
//        int x;
////        System.out.print("Please enter the number larger than 10: ");
////        x = in.nextInt();
////        do {
////            if (x < 10) {System.out.print("Please write again: ");}
////            x = in.nextInt();
////        } while (x < 10);
////        System.out.println(x);
        String theme = "";
        System.out.print("Would you like to change background to dark theme? (yes/no): ");
        while (!(theme.equals("yes") || theme.equals("no"))) {
            theme = in.next().toLowerCase();
            if (!(theme.equals("yes") || theme.equals("no"))) System.out.print("try again: ");
        }
        System.out.println(theme);
    }
}
