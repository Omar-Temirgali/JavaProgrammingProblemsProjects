import java.util.Stack;

public class Cycle {
    private Stack<Integer> cycle;
    private int length;

    public Cycle(Digraph digraph)  {
        try {
            Digraph converse_digraph = digraph.reverse();
            length = digraph.V() + 1;
            for (int v = 0; v < digraph.V(); v++) {
                BreadthFirstDirectedPaths bfs = new BreadthFirstDirectedPaths(converse_digraph, v);
                for (int w : digraph.adj(v)) {
                    if (bfs.hasPathTo(w) && (bfs.distTo(w) + 1) < length) {
                        length = bfs.distTo(w) + 1;
                        cycle = new Stack<Integer>();
                        for (int x : bfs.pathTo(w))
                            cycle.push(x);
                        cycle.push(v);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Iterable<Integer> cycle() {
        return cycle;
    }
    public boolean hasCycle() {
        return cycle != null;
    }
    public int length() {
        return length;
    }
}
