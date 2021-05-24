import java.util.*;
public class problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url = in.nextLine();
        crawler(url);
    }
    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Craw " + urlString);

                for (String s: getSubURLs(urlString)) {
                    if (!listOfPendingURLs.add(s));
                }
            }
        }
    }
    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner in = new Scanner(url.openStream());
            int current = 0;
            while (in.hasNext()) {
                String line = in.nextLine();
                current = line.indexOf("https://sdu.edu.kz/", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("https://sdu.edu.kz", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }
        return list;
    }
}
