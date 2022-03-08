import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int num = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            int ans = num * i;
            System.out.println(num+" * "+i+" = "+ans);
        }
    }
}
