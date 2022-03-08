package FJP6;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
