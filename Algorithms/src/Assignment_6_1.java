import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_6_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/inputTST.txt");
        String str = "age";
        System.out.println(find(str, file));
    }
    private static ArrayList<Integer> find(String word, File text) throws FileNotFoundException {
        Scanner scanner = new Scanner(text);
        LineNumberReader rdr = new LineNumberReader(new FileReader(text));
        ArrayList<Integer> results = new ArrayList<>();
        try {
            while (scanner.hasNextLine()) {
                String line = rdr.readLine();
                if (line.contains(word)) {
                    results.add(rdr.getLineNumber());
                }
            }
            scanner.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            String s = "";
        }
        return results;
    }
}
