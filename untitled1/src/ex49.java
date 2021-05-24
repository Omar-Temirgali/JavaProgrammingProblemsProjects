import java.util.*;
public class ex49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String ch = in.nextLine();
        if (ch.length() < 2) {
            int i = (int)ch.charAt(0);
            System.out.println("The Unicode for the character " +  ch + " is " + i);
        }
        else
            System.out.println("Valid input");
    }
}
