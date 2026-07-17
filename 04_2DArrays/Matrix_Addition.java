import java.util.Scanner;

public class matrix_addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //for matrix A
        System.out.print("Enter no. of rows for A matrix:");
        int rowsA=sc. nextInt();
        System.out.print("Enter no. of columns for A matrix:");
        int columnsA=sc.nextInt();

        System.out.print("Elements of the matrix A:");

        int[][] matA=new int[rowsA][columnsA];
        for(int i=0;i<rowsA;i++){
            for(int j=0; j<columnsA;j++) {
                matA[i][j] = sc.nextInt();
            }
        }

        //for matrix B
        System.out.print("Enter no. of rows for B matrix:");
        int rowsB=sc. nextInt();
        System.out.print("Enter no. of columns for B matrix:");
        int columnsB=sc.nextInt();

        System.out.print("Elements of the matrix B:");

        int[][] matB=new int[rowsB][columnsB];
        for(int i=0;i<rowsB;i++){
            for(int j=0; j<columnsB;j++) {
                matB[i][j] = sc.nextInt();
            }
        }

        //incase unequal matrix a and b
        if(rowsA!=rowsB || columnsA!= columnsB){
            System.out.print(" Addition of Matrix is not possible due to uneven row or column lenght");
            return;
        }

        //initialise matrix c to store output
        int[][] matC=new int[rowsA][columnsA];
        for(int i = 0; i < rowsA; i++) {
            for(int j = 0; j < columnsA; j++) {
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }
        System.out.println("Matrix Addition:");

        for(int i = 0; i < rowsA; i++) {
            for(int j = 0; j < columnsA; j++) {
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
