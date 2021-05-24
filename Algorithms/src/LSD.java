import java.io.*;
import java.util.*;

public class LSD {
    public LSD() { }

    public static void sort(String[] a, int w) {
        int R = 256;
        int N = a.length;
        String[] aux = new String[N];

        for (int d = w - 1; d >= 0; d--) {
            int[] count = new int[R + 1];
            for (int i = 0; i < N; i++)
                count[a[i].charAt(d) + 1]++;
            for (int r = 0; r < R; r++)
                count[r + 1] += count[r];
            for (int i = 0; i < N; i++)
                aux[count[a[i].charAt(d)]++] = a[i];
            for (int i = 0; i < N; i++)
                a[i] = aux[i];
        }
    }

    public static void sort(int[] ints) {
        final int BITS_PER_BYTE = 8;
        final int BIT = 32;
        final int w = BIT / BITS_PER_BYTE;
        final int R = 1 << BITS_PER_BYTE;
        final int M = R - 1;  //hex literal 0xFF = int(255)

        int N = ints.length;
        int[] aux = new int[N];

        for (int d = 0; d < w; d++) {
            int[] count = new int[R + 1];
            for (int item : ints) {
                int c = (item >> BITS_PER_BYTE * d) & M;
                count[c + 1]++;
            }
            for (int r = 0; r < R; r++)
                count[r+1] += count[r];
            if (d == w - 1) {
                int shift1 = count[R] - count[R / 2];
                int shift2 = count[R / 2];
                for (int r = 0; r < R / 2; r++)
                    count[r] += shift1;
                for (int r = R / 2; r < R; r++)
                    count[r] -= shift2;
            }
            for (int value : ints) {
                int c = (value >> BITS_PER_BYTE * d) & M;
                aux[count[c]++] = value;
            }
            System.arraycopy(aux, 0, ints, 0, N);
        }
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
            int w = str[0].length();
            sort(str, w);
            FileWriter fileWriter = new FileWriter("src/wordsOutput.txt");
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
