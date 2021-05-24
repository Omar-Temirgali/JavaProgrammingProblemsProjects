public class Assignment_6_2 {
    public static void main(String[] args) {
        String text = "abacadabrabracabracadabrabrabracad";
        StringBuilder text2 = new StringBuilder();
        text2.append(text);
        text2.reverse();
        System.out.println(text.charAt(text.length()-1));
    }
}
