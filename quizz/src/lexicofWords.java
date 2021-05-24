import java.util.Arrays;
import java.util.Scanner;

public class lexicofWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        //converting to string array
        String[] stringNums = new String[num.length];
        int k = 0;
        while (k < num.length) {
            stringNums[k] = String.valueOf(num[k++]);
        }
        //sorting
        for(int i = 0; i < stringNums.length - 1; ++i) {
            for (int j = i + 1; j < stringNums.length; ++j) {
                if (stringNums[i].compareTo(stringNums[j]) > 0) {
                    // swap words[i] with words[j]
                    String temp = stringNums[i];
                    stringNums[i] = stringNums[j];
                    stringNums[j] = temp;
                }
            }
        }
        //converting back to int array
        int size = stringNums.length;
        int[] arr = new int [size];
        for(int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(stringNums[i]);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (m == arr[i])
                System.out.println(i + 1);
        }
    }
}