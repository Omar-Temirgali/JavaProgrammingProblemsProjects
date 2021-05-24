import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> values = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(in.nextInt());
        }
        int a = queue.remove();
        int b = queue.remove();
        System.out.println(a + " and " + b);
        values.add(a&b);
        System.out.println(queue);
//        queue.add(b);
        queue.add(a);
        System.out.println(queue);
        System.out.println(values);
    }
}

