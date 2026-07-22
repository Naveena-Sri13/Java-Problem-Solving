import java.util.Scanner;

public class time {

    static int TimeToFill(int l, int b, int h, int r) {
        int volume = l * b * h;
        return volume / r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(TimeToFill(l, b, h, r));
    }
}
