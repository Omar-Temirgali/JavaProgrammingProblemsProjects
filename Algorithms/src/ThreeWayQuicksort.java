import java.io.*;
import java.util.*;

public class ThreeWayQuicksort {
    public ThreeWayQuicksort() { }

    public static void sort(String[] a) {
        sort(a, 0, a.length-1, 0);
    }

    private static void sort(String[] a, int lo, int hi, int d) {
        if (hi <= lo) return;
        int lt = lo, gt = hi;
        int v = charAt(a[lo], d);
        int i = lo + 1;
        while (i <= gt) {
            int t = charAt(a[i], d);
            if (t < v) exch(a, lt++, i++);
            else if (t > v) exch(a, i, gt--);
            else i++;
        }

        sort(a, lo, lt - 1, d);
        if (v >= 0) sort(a, lt, gt, d + 1);
        sort(a, gt + 1, hi, d);
    }

    private static int charAt(String s, int d) {
        if (d == s.length()) return -1;
        return s.charAt(d);
    }

    private static void exch(String[] s, int i, int j) {
        String temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            String name = in.next();
            List<String> s = new ArrayList<>();
            File file = new File("src/" + name);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                s.add(scanner.next());
            }
            String[] str = new String[s.size()];
            str = s.toArray(str);
            sort(str);
            FileWriter fileWriter = new FileWriter("src/shellsOutput.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (String a: str) {
                printWriter.println(a);
            }
            printWriter.close();
            fileWriter.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}