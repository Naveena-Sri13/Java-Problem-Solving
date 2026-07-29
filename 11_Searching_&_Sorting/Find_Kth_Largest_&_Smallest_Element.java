import java.util.Scanner;

public class KthLargestSmallest {

    public static void sort(int[] arr, int n) {
        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }

            if (!swap)
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        sort(arr, n);

        if (k <= 0 || k > n) {
            System.out.println("Invalid value of k");
        } else {
            System.out.println(k + "th Smallest Element: " + arr[k - 1]);
            System.out.println(k + "th Largest Element: " + arr[n - k]);
        }
    }
}
