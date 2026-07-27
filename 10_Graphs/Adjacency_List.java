import java.util.Scanner;
import java.util.ArrayList;

public class graph_adjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> Graph = new ArrayList<>();

        System.out.print("Enter the number of vertices:");
        int v = sc.nextInt();
        System.out.print("Enter the size of edges: ");
        int ed=sc.nextInt();

        for (int i = 0; i < v; i++) {
            Graph.add(new ArrayList<>());
        }
        for(int i=0;i<ed;i++){
           int u=sc.nextInt();
           int w=sc.nextInt();
           Graph.get(u).add(w);
           Graph.get(w).add(u);
        }
        for(int i=0;i<v;i++){
            System.out.print(i + " --> ");
            for(int ele: Graph.get(i)){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
}
