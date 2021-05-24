public class Sample {
    public static void main(String[] args) {
        ST<String, String> st = new ST<>();
        ST<String, Integer> st1 = new ST<>();
        st.put("Mañana", "Tomorrow");
        st.put("Semana", "Week");
        st.put("Película", "Movie");
        st.put("Encontrar", "To Find");
        st.put("Trabajar", null);
        st.put("Pequeño", "Small");
        st.put("Aunque", "Although");
        System.out.println("The translation of \'Semana\' is " + "\'" + st.get("Semana") + "\'"); //checking get() method
        st.delete("Película"); //deleting key and its value
        System.out.println(st.contains("Mañana")); //should return true
        System.out.println(st.contains("También")); //should return false
        System.out.println("Is st empty: " + st.isEmpty());
        System.out.println("Is st1 empty: " + st1.isEmpty());
        System.out.println(st.size());
        System.out.println(st.keys());
    }
}
