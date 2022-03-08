
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            System.out.print(rem);
        }
    }
}

