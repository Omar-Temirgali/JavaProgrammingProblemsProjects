import java.util.Stack;

public class AcyclicLongestPath {
    private double[] distTo;
    private DirectedEdge[] edgeTo;

    public AcyclicLongestPath(EdgeWeightedDigraph edgeWeightedDigraph, int s) {
        distTo = new double[edgeWeightedDigraph.V()];
        edgeTo = new DirectedEdge[edgeWeightedDigraph.V()];

        validateVertex(s);

        for (int v = 0; v < edgeWeightedDigraph.V(); v++)
            distTo[v] = Double.NEGATIVE_INFINITY;

        distTo[s] = 0.0;

        Topological topological = new Topological(edgeWeightedDigraph);
        if (!topological.hasOrder())
            throw new IllegalArgumentException("Digraph is not acyclic.");
        for (int v : topological.order()) {
            for (DirectedEdge e : edgeWeightedDigraph.adj(v))
                relax(e);
        }
    }

    public double distTo(int v) {
        validateVertex(v);
        return distTo[v];
    }

    public boolean hasPathTo(int v) {
        validateVertex(v);
        return distTo[v] > Double.NEGATIVE_INFINITY;
    }

    public void relax(DirectedEdge e) {
        int v = e.from(), w = e.to();
        if (distTo[w] < distTo[v] + e.weight()) {
            distTo[w] = distTo[v] + e.weight();
            edgeTo[w] = e;
        }
    }

    public Iterable<DirectedEdge> pathTo(int v) {
        validateVertex(v);
        if (!hasPathTo(v)) return null;
        Stack<DirectedEdge> path = new Stack<DirectedEdge>();
        for (DirectedEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
            path.push(e);
        }
        return path;
    }

    public void validateVertex(int v) {
        int V = distTo.length;
        if (v < 0 || v >= V) throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }
}
