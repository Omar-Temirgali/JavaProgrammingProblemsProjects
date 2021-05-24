import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] list = new int[100000];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 10000);
        }
        long start = System.currentTimeMillis();
        mergeSort(list);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        //System.out.println(Arrays.toString(list));
    }
    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            int[] fH = new int[list.length/2];
            System.arraycopy(list, 0, fH, 0, list.length/2);
            mergeSort(fH);

            int[] sH = new int[list.length - (list.length/2)];
            System.arraycopy(list, list.length/2, sH, 0, list.length - (list.length/2));
            mergeSort(sH);

            merge(fH, sH, list);
        }
    }
    public static void merge(int[] list1, int[] list2, int[] temp) {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        while (c1 < list1.length && c2 < list2.length) {
            if (list1[c1] < list2[c2]) {
                temp[c3++] = list1[c1++];
            } else {
                temp[c3++] = list2[c2++];
            }
        }
        while (c1 < list1.length) {
            temp[c3++] = list1[c1++];
        }
        while (c2 < list2.length) {
            temp[c3++] = list2[c2++];
        }
    }
}
