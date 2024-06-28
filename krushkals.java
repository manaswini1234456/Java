import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class krushkals {

    public static void union(int[] p, int x, int y) {
        int rx = find(p, x);
        int ry = find(p, y);
        if (rx == ry) {
            return;
        }
        p[ry] = rx;
    }

    // find
    public static int find(int[] p, int x) {
        if (p[x] == x) {
            return x;
        }
        return find(p, p[x]);
    }

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        public Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override

        public int compareTo(Pair p) {
            return this.dist - p.dist;
        }
    }

    public static void main(String[] args) {

    }

}
