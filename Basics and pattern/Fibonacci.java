import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int first = 0;
        int second = 1;
        int i = 1;
        while (i <= num) {
            int third = first + second;
            System.out.println(first);
            first = second;
            second = third;
            i++;
        }
    }
}
