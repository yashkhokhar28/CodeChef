/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class GameofPossibility {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int result1 = r * 2 + p;
            if (result1 >= q) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
