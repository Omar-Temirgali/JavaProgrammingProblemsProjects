import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeforces_118A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next().toLowerCase();
        List<Character> chars = new ArrayList<>();
        for (char ch: word.toCharArray()) {
            if (!(ch == 'a' || ch == 'o' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'y')) {
                chars.add(ch);
            }
        }
        for (char ch: chars) {
            System.out.print("." + ch);
        }
    }
}
