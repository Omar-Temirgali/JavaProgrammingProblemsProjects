import java.io.*;
import java.util.Random;

public class task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("output.dat");
        boolean append = file.exists();
        //Random random = new Random();
        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream((new FileOutputStream(file, append))));) {
			for (int i = 0; i < 100; i++)
                output.writeInt(i+1);
        }
        try {
            try (DataInputStream input = new DataInputStream(new FileInputStream("output.dat"))) {
                while (true)
                    System.out.println(input.readInt());
            }
        }
        catch (EOFException ex) {
            System.out.print("");
        }
	}
}