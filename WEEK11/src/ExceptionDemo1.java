import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            String value = iterator.next();
            if(value.equals("456")) {
                list.add("999");
            }
        }
    }
}
