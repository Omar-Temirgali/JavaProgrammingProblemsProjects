import java.io.File;

public class problem2 {
    public static void main (String[] args) {
        File folder = new File("C:/Users/Lenovo/Desktop/Files/java/java_exampls");
        String[] files = folder.list();
        //for (String file: files) {
        //    System.out.println(file);
        //}
        for(int i = 0; i < files.length; i++) {
            if (files[i].contains(".java")) {
                System.out.println(files[i]);
            }
        }
    }
}
