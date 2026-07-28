import java.util.Scanner;

public class linear_SearchSort {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of elements:");
        int n =sc.nextInt();

        System.out.print("Enter the Elements of  array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter the searching element: ");
        int search=sc.nextInt();

        for(int i=0;i<n;i++) {

            if (arr[i] == search) {
                System.out.print("The element is at index:" + i);
                return;
            }
        }
        System.out.print("Element not found in the array.");

    }

}
