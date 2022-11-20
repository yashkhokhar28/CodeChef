/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class ChefandPaper {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();
            int a = x * 3;
            int b = (n - x);
            int c = (a - b);
            if (c >= p) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
    }
}
