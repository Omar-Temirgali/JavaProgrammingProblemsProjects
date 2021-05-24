import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapTest {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> counts = new Map<>();
        ArrayList<String> words = new ArrayList<>();

        Scanner fin = new Scanner(new File("Main.txt"));
        String text = "";
        while (fin.hasNextLine()) text += fin.nextLine() + "\n";

        Pattern pattern = Pattern.compile("[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group().toLowerCase());
        }
        System.out.println(words);
        for (String word: words) {
            if (counts.contains(word)) {
                counts.set(word, counts.get(word) + 1);
            } else {
                counts.set(word, 1);
            }
        }
//        System.out.println(counts);
    }
}
