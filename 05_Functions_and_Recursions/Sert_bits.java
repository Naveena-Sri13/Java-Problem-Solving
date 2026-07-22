import java.util.Scanner;

public class Main {

    static int countSetBits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 2) + countSetBits(number / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(countSetBits(number));
    }
}
