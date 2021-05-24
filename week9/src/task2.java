public class task2 {
    public static void main(String[] args) {
        Integer[] list = {454,5466,48,4,84,6,29,8,50,46,846,0,48,4,64,654,64,4};
        System.out.println(linearSearch(list, 1));
        System.out.println(linearSearch(list, 13));
        System.out.println(linearSearch(list, 29));
        System.out.println(linearSearch(list, 46));
        System.out.println(linearSearch(list,645));

    }
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }
}
