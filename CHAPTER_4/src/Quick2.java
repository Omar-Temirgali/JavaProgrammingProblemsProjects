import java.util.ArrayList;
import java.util.Scanner;

public class Quick2 {
    private static void swap(char[] list, int i, int j) {
        char temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    private static ArrayList<Integer> partition(char[] list, int start, int end) {
        int mid = start;
        int pivot = list[end];
        ArrayList<Integer> pair = new ArrayList<>();

        while (mid <= end) {
            if (list[mid] < pivot) {
                swap(list, start, mid);
                start++;
                mid++;
            } else if (list[mid] > pivot) {
                swap(list, mid, end);
                end--;
            } else {
                mid++;
            }
        }
        pair.add(start - 1);
        pair.add(mid);
        return pair;
    }
    private static void quickSort(char[] list, int start, int end) {
        if (start >= end) {
            return;
        }
        if (start - end == 1) {
            if (list[start] < list[end]) {
                swap(list, start, end);
            }
            return;
        }
        ArrayList<Integer> pair = partition(list, start, end);
        quickSort(list, start, pair.get(0));
        quickSort(list, pair.get(1), end);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] array = in.next().toCharArray();
        quickSort(array, 0, array.length - 1);
        System.out.println(new String(array));
    }
}
