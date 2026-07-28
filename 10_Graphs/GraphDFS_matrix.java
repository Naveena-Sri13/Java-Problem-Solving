import java.util.Scanner;

public class graphDFS_matrix {

    public static void DFS(int[][] graph, boolean[] vis, int st, int n) {
        vis[st] = true;
        System.out.print(st + " ");

        for (int i = 0; i < n; i++) {
            if (graph[st][i] == 1 && !vis[i]) {
                DFS(graph, vis, i, n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int edge = sc.nextInt();

        int[][] graph = new int[n][n];
        System.out.println("Enter the edges:");
        for (int i = 0; i < edge; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        boolean[] vis = new boolean[n];

        System.out.print("Starting point of the traversal: ");
        int start = sc.nextInt();

        System.out.print("DFS Traversal: ");
        DFS(graph, vis, start, n);
    }
}
