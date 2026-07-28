import java.util.Scanner;

public class binary_SearchSort {

    public static int Binary(int[] arr, int search) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == search) {
                return mid;
            }
            else if (arr[mid] < search) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements of array (sorted): ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the searching element: ");
        int search = sc.nextInt();

        int index = Binary(arr, search);

        if (index != -1) {
            System.out.println("The element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
