import java.io.*;

public class task2 {
    public static void main(String[] args) throws IOException {
        int[] numbers = {100, 1000, 10000, 100000, 200000, 400000, 1000000, 2000000};
        PrintWriter printWriter = new PrintWriter("nums.txt");
        for (int i = 0; i < numbers.length; i++)
            printWriter.print(numbers[i] );
        printWriter.close();

        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("nums.dat"));
        for (int i = 0; i < numbers.length; i++)
            outputStream.writeInt(numbers[i]);
        outputStream.close();

        DataOutputStream outputStream1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("nums1.dat")));
        for (int i = 0; i < numbers.length; i++)
            outputStream1.writeInt(numbers[i]);
        outputStream1.close();
    }
}
