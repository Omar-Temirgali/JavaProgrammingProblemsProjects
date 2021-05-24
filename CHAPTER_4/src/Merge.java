import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] array = in.next().toCharArray();
        bottomUp(array, new char[array.length], array.length);
        System.out.println(new String(array));
    }
    static void merge(char[] a, int start, int middle, int end, char[] aux) {
        int i = start, j = middle;
        for (int k = start; k < end; k++) {
            if (i < middle && (j >= end || a[i] <= a[j])) {
                aux[k] = a[i];
                i++;
            } else {
                aux[k] = a[j];
                j++;
            }
        }
    }
    //copying from main array into auxiliary array
    static void copyArray(char[] main, int s, int e, char[] aux) {
        for (int k = s; k < e; k++) aux[k] = main[k];
    }
    static void bottomUp(char[] main, char[] aux, int n) {
        for (int length = 1; length < n; length *= 2) {
            for (int i = 0; i < n; i = i + 2 * length)
                merge(main, i, Math.min(i + length, n), Math.min(i + 2 * length, n), aux);
            copyArray(aux, 0, n, main); //returning aux[] into main[]
        }
    }
}
