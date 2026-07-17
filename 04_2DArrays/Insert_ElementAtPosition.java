import java.util.Scanner;

public class edit_array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size+1];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        int ele=sc.nextInt();
        int pos=sc.nextInt();

        for(int i=0;i<=(size-pos);i++){
            arr[size-i]=arr[size-i-1];

        }
        arr[pos-1]=ele;

        for (int i=0;i<=size;i++){

            System.out.println(arr[i]+" ");
        }
    }
}
