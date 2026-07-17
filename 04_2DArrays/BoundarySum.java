import java.util.Scanner;

public class Sum_boundary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                if(i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    sum += mat[i][j];
                }

            }
        }

        System.out.println("Boundary Sum = " + sum);
    }
}
