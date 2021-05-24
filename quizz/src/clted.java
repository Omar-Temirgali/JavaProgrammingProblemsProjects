import java.util.Scanner;

public class clted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] list = new String[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = in.next();
        }
        bubblesortlength(list);
        buub(list);
        for (int i = 0; i < n; i++) {
            System.out.println(list[i]);
        }
    }
    public static void bubblesortlength(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void buub(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() == arr[j].length() && arr[i].charAt(0) > arr[j].charAt(0)) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
