import java.io.*;
import java.util.*;

public class BFStringSearch {

    private static int search(String pat, String text) {
        int i, N = text.length();
        int j, M = pat.length();

        for (i = 0, j = 0; i < N && j < M; i++) {
            if (text.charAt(i) == pat.charAt(j)) {
                j++;
            } else {
                i -= j; j = 0;
            }
        }
        if (j == M) return i - M;
        else return N;
    }

    private static int searchRightToLeft(String pat, String text) {
        int m = pat.length();
        int n = text.length();
        for (int i = n - m; i >= 0; i--) {
            int j;
            for (j = 0; j < m; j++)
                if (text.charAt(i + j) != pat.charAt(j)) break;
            if (j == m) return i;
        }
        return n;
    }

    private static int searchRightToLeftReverse(String pat, String text) {
        int m = pat.length();
        int n = text.length();

        for (int i = n - 1; i > m - 1; i--) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i - j) != pat.charAt(j)) break;
            }
            if (j == m) return i;
        }
        return n;
    }

    public static void main(String[] args) {
        try {
            File file = new File("src/InputBF.txt");
            Scanner sc = new Scanner(file);
            List<Integer> res = new ArrayList<>();
            FileWriter fW = new FileWriter("src/OutputBF.txt");
            PrintWriter pW = new PrintWriter(fW);
            while (sc.hasNextLine()) {
                String pat = sc.next();
                String text = sc.next();
                res.add(searchRightToLeftReverse(pat, text));
            }
            for (int r: res) {
                pW.println(r);
            }
            pW.close();
            fW.close();
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
