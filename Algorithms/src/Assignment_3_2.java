import java.util.Scanner;

public class Assignment_3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v = n + 1;
        int e = in.nextInt();
        EdgeWeightedGraph graph = new EdgeWeightedGraph(v);
        for (int i = 0; i < e; i++) {
            Edge edge = new Edge(in.nextInt(), in.nextInt(), in.nextDouble());
            graph.addEdge(edge);
        }
        KruskalMST mst = new KruskalMST(graph);
        for (Edge edge: mst.edges()) {
            StdOut.println(edge);
        }
        System.out.printf("%.5f", mst.weight());
    }
}
