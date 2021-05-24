import java.io.*;
import java.util.Scanner;

public class Assignment_4_1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            String fileName = in.next();
            int s = in.nextInt();

            File file = new File("src/" + fileName);
            Scanner reader = new Scanner(file);
            int V = reader.nextInt();
            int E = reader.nextInt();
            EdgeWeightedDigraph edgeWeightedDigraph = new EdgeWeightedDigraph(V);
            for (int i = 0; i < E && reader.hasNextLine(); i++) {
                DirectedEdge edge = new DirectedEdge(reader.nextInt(), reader.nextInt(), reader.nextDouble());
                edgeWeightedDigraph.addEdge(edge);
            }
            AcyclicLongestPath lp = new AcyclicLongestPath(edgeWeightedDigraph, s);
            FileWriter fileWriter = new FileWriter("src/output.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (int v = 0; v < edgeWeightedDigraph.V(); v++) {
                if (lp.hasPathTo(v)) {
                    printWriter.printf("%d to %d (%.2f)  ", s, v, lp.distTo(v));
                    for (DirectedEdge e : lp.pathTo(v)) {
                        printWriter.print(e + " ");
                    }
                    printWriter.println();
                } else {
                    printWriter.printf("%d to %d         no path\n", s, v);
                }
            }
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
