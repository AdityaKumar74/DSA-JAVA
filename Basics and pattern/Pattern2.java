
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

// My way

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int row = 0; row <= n; row++) {
		    int space  = row;
		    int star = n - space;
		    for (int j = 1; j <= star; j++) {
		        System.out.print(" *");
		    }
		    
		    for (int i = 1; i <= space; i++) {
		        System.out.print(" \t");
		    }
		    
		    System.out.println();
		    
		}
		
	}
}
