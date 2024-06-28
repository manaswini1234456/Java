import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph2 {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int v) {
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 6));
    }

    public static void bfs(ArrayList<Edge> graph[], boolean[] visited, int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);// start vertex
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge> graph[], boolean[] visited, int v) {
        if (visited[curr])
            return;
        System.out.println(curr + " ");
        visited[curr] = true;
        for (Edge e : graph[curr]) {
            dfs(graph, visited, e.dest);
        }
    }

    public static void printAllPaths(ArrayList<Edge> graph[], boolean[] visited, int curr, int target, String path) {
        if (curr == target) {
            System.out.println(path);
            return;
        }
        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                visited[curr] = true;
                printAllPaths(graph, visited, e.dest, target, path + "->" + e.dest);
                visited[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        // boolean[] visited = new boolean[];
        createGraph(graph, v);
        boolean[] visited = new boolean[v];
        int src = 0;
        int target = 0;
        printAllPaths(graph, visited, src, target, "" + src);
        System.out.println();

    }
}