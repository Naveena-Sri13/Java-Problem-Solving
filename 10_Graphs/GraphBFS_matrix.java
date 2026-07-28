import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class graphBFS_Matrix {

    public static void BFS(int[][] graph, boolean[] vis, int st, int n){
        Queue<Integer> q=new LinkedList<>();
        vis[st]=true;
        q.add(st);

        while(!q.isEmpty()){
            int cur =q.poll();
            System.out.print(cur + " ");

            for(int i=0;i<n;i++){
                if (graph[cur][i] == 1 && !vis[i]) {
                    vis[i] = true;
                    q.add(i);
                }
            }

        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of vertices:");
        int n=sc.nextInt();
        System.out.print("Enter the number of edges:");
        int edge=sc.nextInt();

        int[][] graph = new int[n][n];

        for (int i=0;i<edge;i++){
            int u=sc.nextInt();
            int v= sc.nextInt();

            graph[u][v]=1;
            graph[v][u]=1;
        }

        boolean[] vis = new boolean[n];

        System.out.print("Starting vertex for traversal:");
        int tr= sc.nextInt();

        BFS(graph, vis, tr,n);
    }

}
