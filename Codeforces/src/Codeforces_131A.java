import java.util.Scanner;

public class Codeforces_131A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char[] wordch = word.toCharArray();
        boolean c = true;
        for(int i = 1; i < wordch.length; i++)
            if(Character.isLowerCase(wordch[i]))
                c = false;
        if(c)
            for(int i = 0; i < wordch.length; i++)
                if(Character.isUpperCase(wordch[i]))
                    wordch[i] = Character.toLowerCase(wordch[i]);
                else
                    wordch[i] = Character.toUpperCase(wordch[i]);
        for (char value : wordch) System.out.print(value);
    }
}
