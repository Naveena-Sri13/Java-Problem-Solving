import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alice = new int[3];
        int[] bob = new int[3];
        for (int i = 0; i < 3; i++) {
            alice[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            bob[i] = sc.nextInt();
        }
      
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < 3; i++) {
            if (alice[i] > bob[i]) {
                aliceScore++;
            } else if (alice[i] < bob[i]) {
                bobScore++;
            }
        }
        System.out.println(aliceScore + " " + bobScore);
    }
}
