
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int row = 1; row <= n; row++) {
            int str = n + 1 - row;
            for (int col = 1; col <= str; col++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
