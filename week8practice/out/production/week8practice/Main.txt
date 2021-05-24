import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        StackOfObjects stack = new StackOfObjects();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


//        StackOfObjects stack = new StackOfObjects();
//        stack.push("coronavirus");
//        stack.push("defeat");
//        stack.push("will");
//        stack.push("we");
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


//        StackOfObjects stack = new StackOfObjects();
//        stack.push(1);
//        stack.push("hello");
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


//        StackOfObjects stack = new StackOfObjects();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push("hello");
//
//        int total = 0;
//        while (!stack.empty()) {
//            total += (int) stack.pop();
//        }
//
//        System.out.println(total);


//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        int total = 0;
//        while (!stack.empty()) {
//            total += (int) stack.pop();
//        }
//
//        System.out.println(total);


//        Integer[] intArr = {1, 2, 3};
//        Double[] dblArr = {1.1, 2.2, 3.3};
//        String[] strArr = {"we", "will", "defeat", "coronavirus"};
//        ArrayList<Double> doubleArr = new ArrayList<>();
//        doubleArr.add(3.14);
//        doubleArr.add(2.71);
//        doubleArr.add(1.618);

//        printArrayList(doubleArr);

//        printArr(intArr);
//        printArr(strArr);


//        Integer[] intArr = {1, 2, 3};
//        Double[] dblArr = {1.1, 2.2, 3.3};
//        sum(intArr);
//        sum(dblArr);

//        max(1, 3);
//        max("vitamin C", "coronavirus");


//        System.out.println(max(1, 3));
//        String winner = max("vitamin C", "coronavirus");
//        System.out.println(winner);


//        Stack stack = new Stack();  // same as Stack<Object> stack = new Stack<>();
//        ArrayList arr = new ArrayList();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push("hello"); /// huge huge problem


        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        Stack<Double> doubleStack = new Stack<>();
        doubleStack.push(1.1);
        doubleStack.push(2.2);
        doubleStack.push(3.3);

//        printStack(intStack);
//        printStack(doubleStack);
        System.out.println(sum(intStack));
        System.out.println(sum(doubleStack));
    }


    public static <E> void printArr(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static <E> void printArrayList(ArrayList<E> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static <E extends Number> void sum(E[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].doubleValue();
        }

        System.out.println(total);
    }

    public static <E extends Comparable<E>> E max(E a, E b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public static Double sum(Stack<? extends Number> arr) {
        double total = 0;
        while (!arr.empty()) {
            total += arr.pop().doubleValue();
        }

        return total;
    }

    public static void printStack(Stack<?> arr) {
        while (!arr.empty()) {
            System.out.println(arr.pop());
        }
    }
}
