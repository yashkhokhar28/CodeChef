/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
/*Chef loves research! Now he is looking for subarray of maximal length with non-zero product.

Chef has an array A with N elements: A1, A2, ..., AN.

Subarray Aij of array A is elements from index i to index j: Ai, Ai+1, ..., Aj.

Product of subarray Aij is product of all its elements (from ith to jth).*/
public class ChefandSubarray {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0, m = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] == 0) {
                c = 0;
            } else {
                c++;
                if (c > m) {
                    m = c;
                }
            }
        }
        System.out.println(m);
    }
}
