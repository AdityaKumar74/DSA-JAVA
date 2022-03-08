
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = in.nextInt();

            int flag = 1;
         /*These are also the logic of checking no is prime or not
         for(int i = 2; i <= (n-1); i++)
         for(int i = 2; i <= n/2; i++)
         but this logic 👇 is more efficient than others.*/
            for (int j = 2; j*j <= n; j++) {
                if (n % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }
    }
}
