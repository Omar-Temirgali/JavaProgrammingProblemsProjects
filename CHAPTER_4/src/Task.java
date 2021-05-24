import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        String keyboard = "qwertyuiopasdfghjklzxcvbnm";
        Scanner in = new Scanner(System.in);
        String letter = in.next();
        if (letter.equals(letter.toUpperCase())) keyboard = keyboard.toUpperCase();
        int pos = 0;
        for (int i = 0; i < keyboard.length(); i++) {
            if (letter.charAt(0) == keyboard.charAt(i)) pos = i;
        }
        if (letter.charAt(0) == keyboard.charAt(keyboard.length() - 1)) System.out.print(keyboard.charAt(0));
        else System.out.print(keyboard.charAt(pos + 1));
    }
}
