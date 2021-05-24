import java.util.Scanner;
import java.lang.String;

public class caps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        mult(word);
    }
    public static void mult(String wordd) {
        int n = (int)wordd.charAt(0);
        if (n >= 65 && n <= 90) {
            String word1 = wordd.substring(1, wordd.length()).toLowerCase();
            String word2 = wordd.charAt(0) + word1;
            System.out.println(word2);

        }
        else if (n >= 97 && n <= 122) {
            String word3 = wordd.toUpperCase();
            String word4 = word3.substring(1, word3.length()).toLowerCase();
            String word5 = word3.charAt(0) + word4;
            System.out.println(word5);

        }

    }
}
