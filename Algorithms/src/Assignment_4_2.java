import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment_4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fileName = in.next();
        try {
            File file = new File("src/" + fileName);
            Scanner reader = new Scanner(file);
            int n = reader.nextInt();
            int s = 2 * n;
            int t = s + 1;
            EdgeWeightedDigraph edgeWeightedDigraph = new EdgeWeightedDigraph(s + 2);
            for (int i = 0; i < n && reader.hasNextLine(); i++) {
                double duration = reader.nextDouble();
                DirectedEdge edge1 = new DirectedEdge(s, i, 0.0);
                DirectedEdge edge2 = new DirectedEdge(i + n, t, 0.0);
                DirectedEdge edge3 = new DirectedEdge(i, i + n, duration);

                edgeWeightedDigraph.addEdge(edge1);
                edgeWeightedDigraph.addEdge(edge2);
                edgeWeightedDigraph.addEdge(edge3);

                int m = reader.nextInt();
                for (int j = 0; j < m; j++) {
                    int p = reader.nextInt();
                    edgeWeightedDigraph.addEdge(new DirectedEdge(n + i, p, 0.0));
                }
            }

            FileWriter fileWriter = new FileWriter("src/JobsOutput.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            AcyclicLongestPath lp = new AcyclicLongestPath(edgeWeightedDigraph, s);
            printWriter.println(" Job     Start     Finish");
            printWriter.println("-------------------------");
            for (int i = 0; i < n; i++) {
                printWriter.printf("%4d %9.1f %9.1f\n", i, lp.distTo(i), lp.distTo(i+n));
            }
            printWriter.printf("Finish time: %11.1f\n", lp.distTo(t));
            printWriter.close();
            fileWriter.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
