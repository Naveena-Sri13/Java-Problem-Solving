import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class graphBFS_List {

    public static void BFS(ArrayList<ArrayList<Integer>> gh, boolean[] vis, int st) {
        Queue<Integer> q = new LinkedList<>();
        vis[st] = true;
        q.add(st);

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int ele : gh.get(curr)) {
                if (!vis[ele]) {
                    vis[ele] = true;
                    q.add(ele);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> gh = new ArrayList<>();

        int n = sc.nextInt();
        int edge = sc.nextInt();
        for (int i = 0; i < n; i++) {
            gh.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            gh.get(u).add(v);
            gh.get(v).add(u);
        }

        boolean[] vis = new boolean[n];

        System.out.print("Starting point of the traverse: ");
        int s1 = sc.nextInt();

        BFS(gh, vis, s1);
    }
}

