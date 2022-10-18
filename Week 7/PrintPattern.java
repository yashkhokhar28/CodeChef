/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// Problem Read problems statements Mandarin,Bengali,Hindi,Russian and Vietnamese as well.Consider the following 4\times 44×4 pattern:

// 1 2 4 7 3 5 8 11 6 9 12 14 10 13 15 16 You are given an integer NN.Print the N\times NN×N pattern of the same kind(containing integers 11 through N^2 N 2).

// Input The first line of the input contains a single integer TT denoting the number of test cases.The description of TT test cases follows.The first and only line of each test case contains a single integer NN.Output For each test case,print NN lines;each of them should contain NN space-separated integers.
public class PrintPattern {
    static void printPattern(int n) {
        // arr[][] will store the pattern matrix
        int arr[][] = new int[n][n];
        int k, i, j, p = 1, f;

        // Store the values for upper triangle
        // of the pattern
        for (k = 0; k < n; k++) {
            j = k;
            i = 0;
            while (j >= 0) {
                arr[i][j] = p;
                p++;
                i = i + 1;
                j = j - 1;
            }
        }

        // Store the values for lower triangle
        // of the pattern
        for (k = 1; k < n; k++) {
            i = k;
            j = n - 1;
            f = k;
            while (j >= f) {
                arr[i][j] = p;
                p++;
                i = i + 1;
                j = j - 1;
            }
        }

        // Print the pattern
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            printPattern(n);
        }
    }
}
