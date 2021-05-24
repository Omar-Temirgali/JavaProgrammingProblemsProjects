import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int V, E;
        double sum = 0;
        List<EdgeWeightedGraph> list = new ArrayList<>();
        for (int i = 0; i < f; i++) {
            V = sc.nextInt();
            E = sc.nextInt();
            EdgeWeightedGraph graph = new EdgeWeightedGraph(V);
            for (int j = 0; j < E; j++) {
                Edge edge = new Edge(sc.nextInt(), sc.nextInt(), sc.nextDouble());
                graph.addEdge(edge);
            }
            list.add(graph);
        }
        for (EdgeWeightedGraph graph: list) {
            PrimMST mst = new PrimMST(graph);
            for (Edge edge: mst.edges()) {
                StdOut.println(edge);
            }
            sum += mst.weight();
            System.out.printf("%.5f", mst.weight());
            StdOut.println("\n");
        }
        System.out.print("The total weight: ");
        System.out.printf("%.5f", sum);
    }
}
