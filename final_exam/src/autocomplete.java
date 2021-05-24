import java.util.*;
public class autocomplete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String search = in.nextLine();
        int n = in.nextInt();

        String[] words = new String[n];
        for (int i = 0; i < words.length; i++) {
            words[i] = in.next();
        }
        //ordering lexicographically
        for(int i = 0; i < n-1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(words));
        //picking lexicographically word
    }
}
