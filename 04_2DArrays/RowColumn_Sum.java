import java.util.Scanner;

public class Sum_row_column {
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
        // Row Sum
        System.out.println("\nRow Sum:");
        for(int i = 0; i < row; i++) {
            int sum = 0;
            for(int j = 0; j < column; j++) {
                sum += mat[i][j];
            }
            System.out.println("Row " + (i + 1) + " = " + sum);
        }

        // Column Sum
        System.out.println("\nColumn Sum:");
        for(int j = 0; j < column; j++) {
            int sum = 0;
            for(int i = 0; i < row; i++) {
                sum += mat[i][j];
            }
            System.out.println("Column " + (j + 1) + " = " + sum);
        }

    }
}
