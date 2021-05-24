import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer for days ");
        int days = input.nextInt();

        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println(days + " days are " + hours + " hours or  " + minutes + " minutes or " + seconds + " seconds");
    }
}                                                                  