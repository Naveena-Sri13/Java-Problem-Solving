import java.util.*;

public class quick_sort {

    static int partition(int arr[], int left, int right) {

        int pivot = arr[left];
        int i = left;
        int j = right;

        while (i < j) {

            while (i <= right && arr[i] <= pivot)
                i++;

            while (arr[j] > pivot)
                j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;
        return j;
    }
    static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int pos = partition(arr, left, right);
            quickSort(arr, left, pos - 1);
            quickSort(arr, pos + 1, right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n-1);
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
