

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int row = 1; row <= n; row++) {
            // int nst = row;
            int nsp = n - row; // int nsp = n - nst (for the better understanding)
            for (int i = 1; i <= nsp; i++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= row; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
