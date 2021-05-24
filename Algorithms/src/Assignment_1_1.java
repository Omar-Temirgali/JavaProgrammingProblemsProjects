import java.util.Scanner;

public class Assignment_1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_ver = in.nextInt(), num_edg = in.nextInt();
        Graph tree = new Graph(num_ver);
        for (int i = 0; i < num_edg; i++) tree.addEdge(in.nextInt(), in.nextInt());
        if (isTree(tree, num_ver)) System.out.println("It is a tree");
        else System.out.println("It is not a tree");
    }
    private static boolean isTree(Graph graph, int num_ver) {
        boolean[] marked = new boolean[num_ver];
        boolean isTree = depthFirstSearch(graph, 1, marked, -1);
        for (int i = 0; isTree && i < num_ver; i++) {
            if (!marked[i]) isTree = false;
        }
        return isTree;
    };
    private static boolean depthFirstSearch(Graph graph, int V, boolean[] marked, int parent) {
        marked[V] = true;
        for (int W: graph.adj(V)) {
            if (!marked[W]) {
                if (!depthFirstSearch(graph, W, marked, V)) return false;
            } else if (W != parent) return false;
        }
        return true;
    }
}
