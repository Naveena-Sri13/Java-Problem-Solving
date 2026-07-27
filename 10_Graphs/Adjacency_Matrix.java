import java.util.Scanner;


public class graphs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of vertices:");
        int v= sc.nextInt();
        System.out.println("Enter the no.of edges");
        int ed = sc.nextInt();

        int[][] mat=new int[v][v];

        for(int i =0;i<ed;i++){
            int u= sc.nextInt();
            int w= sc.nextInt();
            mat[u][w]=1;
        }

        for (int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

