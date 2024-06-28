public class graph1 {

    public static void main(String[] args) {
        int v = 4;
        int[][] graph = new int[v][v];
        graph[0][2] = 1;

        graph[1][2] = 1;
        graph[1][3] = 1;

        graph[2][0] = 1;
        graph[2][1] = 1;

        graph[3][1] = 1;
        graph[3][2] = 1;

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

    }
}