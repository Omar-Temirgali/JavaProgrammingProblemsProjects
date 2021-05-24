import java.util.ArrayList;

public class ExceptionDemo {
    public static void main(String args[]){
        ArrayList<String> books = new ArrayList<String>();
        books.add("Tokyo");
        books.add("Seoul");
        books.add("Moscow");
        books.add("Paris");

        for(String obj : books) {
            System.out.println(obj);
            //We are adding element while iterating list
            books.add("New York");
        }
    }
}