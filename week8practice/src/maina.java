public class maina {
    public static void main(String[] args) {
        StackOfObjects stack = new StackOfObjects();
        stack.push("coronavirus");
        stack.push('f');
        stack.push(false);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
