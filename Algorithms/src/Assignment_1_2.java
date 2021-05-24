import java.util.*;
import java.util.stream.Collectors;

public class Assignment_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_ver = in.nextInt(), num_edg = in.nextInt();
        Graph tree = new Graph(num_ver);
        for (int i = 0; i < num_edg; i++) tree.addEdge(in.nextInt(), in.nextInt());
        ArrayList<Integer> cycles = new ArrayList<>();
        boolean[] marked = new boolean[num_ver];
        boolean isTree = depthFirstSearch(tree, 0, marked, -1, cycles);
        if (!isTree) {
            List<Integer> result = removeDuplicates(cycles);
            System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining("-")));
        } else {
            System.out.println("Given graph does not have any cycles");
        }
    }
    private static boolean depthFirstSearch(Graph graph, int V, boolean[] marked, int parent, ArrayList<Integer> cycles) {
        marked[V] = true;
        for (int W: graph.adj(V)) {
            if (!marked[W]) {
                if (!depthFirstSearch(graph, W, marked, V, cycles)) {
                    cycles.add(W);
                    cycles.add(V);
                    return false;
                }
            } else if (W != parent) {
                cycles.add(W);
                return false;
            }
        }
        return true;
    }
    private static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        for (E vertex: list) {
            if (!newList.contains(vertex)) newList.add(vertex);
        }
        newList.add(list.get(list.size() - 1));
        return newList;
    }
}
