import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Assignment_2_1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt(), E = in.nextInt();
        Digraph graph = new Digraph(V);
        for (int i = 0; i < E; i++) graph.addEdge(in.nextInt(), in.nextInt());
        Cycle cycle = new Cycle(graph);
        if (cycle.hasCycle()) {
            System.out.print("The shortest directed cycle is ");
            List<Integer> result = new ArrayList<Integer>();
            cycle.cycle().forEach(result::add);
            int item = result.get(result.size() - 1);
            result.remove(result.size() - 1);
            result.add(0, item);
            System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining("-")));
        } else {
            System.out.println("There is no directed cycle");
        }
    }
}
