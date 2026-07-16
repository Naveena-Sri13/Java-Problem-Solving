import java.util.Scanner;

public class array_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no.of row:");
        int row=sc.nextInt();
        System.out.print("Enter no.of column:");
        int column=sc.nextInt();
        int[][] mat=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0; j<column;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix:");
        for(int i =0;i <row;i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println( );
        }
    }
}
