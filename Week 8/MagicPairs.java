/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class MagicPairs {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            long n = sc.nextInt();
            int array[] = new int[(int) n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println((n * (n - 1)) / 2);
        }
    }
}
