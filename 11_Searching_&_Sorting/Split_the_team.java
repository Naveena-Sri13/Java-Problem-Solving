import java.util.Scanner;

public class Split_the_teams {
    public static int Players(int n, int[] arr){
        boolean taken = false;
        int ans = 0;
        int team=n/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int target=sum/team;
        for(int i=0;i<n;i++){
             ans=target-arr[i];
        }
        for(int i=0;i<n;i++){
            if (taken[i]){
                continue;
            }
            int match=target-arr[i];
            boolean found= false;
            int chemistry=0;
            for(int j=i+1;j<n;j++){
                if(!taken[j] && arr[j]== match){
                    chemistry+=arr[i]* arr[j];
                }
                taken[i]=true;
                taken[j]=true;

                found=true;
                break;
            }

        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of team:");
        int n=sc.nextInt();
        System.out.print("Enter the Skill of Players:");
        int[] arr=new int[n];
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int chem = Players(arr, n);
        System.out.print("The sum chemistry:"+ chem);
    }
}
