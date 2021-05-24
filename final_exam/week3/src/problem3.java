import java.io.*;
import java.util.*;

public class problem3 {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        System.out.println("Enter file directory: ");
        //String fileName = in.nextLine();
        File file = new File("C:/Users/Lenovo/Desktop/coronavirus.txt");

        if(!file.exists()) {
            System.out.println(file + " does not exist");
            System.exit(1);
        }
        String buffer = "";
        int[] letterCount = new int[26];
        int sp = 0;
        try (Scanner in = new Scanner(file)) {
            while (in.hasNext()) {
                buffer = in.nextLine();
                for (char ch: buffer.toCharArray()) {
                    ch = Character.toUpperCase(ch);
                    if (isLetter(ch)) {
                        letterCount[ch - 'A']++;
                    } else if (ch == ' ') {
                        sp++;
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < letterCount.length; i++) {
            System.out.println((char) (i + 'A') + " occurence = " + letterCount[i]);
        }
        System.out.println("Space occurence  = " + sp);
    }
    private static boolean isLetter(char ch) {
        return (ch >= 'A' && ch <= 'Z');
    }
}
