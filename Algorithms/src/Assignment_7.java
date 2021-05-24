import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Assignment_7 {
    private static String fileName = "src/inputTST.txt";
    private static String fileOutput = "src/outputTST.txt";

    public static void main(String[] args) {
        TST st = new TST();
        try {
//            File file = new File(fileName);
//            Scanner scanner = new Scanner(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            List<String> all = new ArrayList<>();
            String line = "";
            while (reader.readLine() != null) {
                line = reader.readLine().toLowerCase().replaceAll("\\p{Punct}", "");
                String[] words = line.split(" ");
                all.addAll(Arrays.asList(words));
            }

            for (String key: all) {
                ArrayList<Integer> list = find(key);
                String val;
                if (list.size() > 2) {
                    val = Collections.min(list) + "-" + Collections.max(list);
                } else {
                    val = list.stream().map(String::valueOf).collect(Collectors.joining("-"));
                }
                st.put(key, val);
            }

//            FileWriter fileWriter = new FileWriter(fileOutput);
//            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (String key: st.keys()) {
                System.out.println(key + " " + st.get(key));
            }

//            printWriter.close();
//            fileWriter.close();
//            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Integer> find(String word) {
        ArrayList<Integer> lineNumbers = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
            while (scanner.hasNextLine()) {
                String line = lineNumberReader.readLine().toLowerCase().replaceAll("\\p{Punct}", "");
                if (line.contains(word)) {
                    lineNumbers.add(lineNumberReader.getLineNumber());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            String s = "";
        }
        return lineNumbers;
    }
}
