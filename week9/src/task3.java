public class task3 {
    public static void main(String[] args) {
        Integer[][] array = {{1,4,6}, {45,97,6}, {699,78,455}};
        System.out.println(max(array));
    }
    public static <E extends Comparable<E>> E max(E[][] array) {
       E max = array[0][0];
       for(E[] tuples: array) {
           for(E tuple: tuples) {
               if(tuple.compareTo(max )> 0) {
                   max = tuple;
               }
           }
       }
       return max;
    }
}
