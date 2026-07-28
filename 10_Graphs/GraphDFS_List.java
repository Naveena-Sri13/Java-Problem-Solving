import java.util.ArrayList;
import java.util.Scanner;
public class graphDFS_stack {
    public static void DFS(ArrayList<ArrayList<Integer>> gh,boolean[] vis, int st){
        vis[st] = true;
        System.out.print((st +" "));

        for(int ele:gh.get(st)){
            if(!vis[ele]){
                DFS(gh,vis,ele);

            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>>gh = new ArrayList();
        int n = sc.nextInt();
        int edge = sc.nextInt();
        for(int i=0;i<n;i++){
            gh.add(new ArrayList<>());

        }
        for (int i=0;i<edge;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            gh.get(u).add(v);
            gh.get(v).add(u);
        }
        boolean[] vis = new boolean[n];
        System.out.print("starting point of the traverse: ");
        int s1=sc.nextInt();

        DFS(gh,vis,s1);

    }
}
