/* package codechef; // don't place package name! */
/*---Defenation---
Find the degree of the polynomial.

Note: It is guaranteed that there exists at least one term with non-zero coefficient.
 */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
public class DegreeOfPolynomial {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int terms = sc.nextInt();
            int degree = 0;
            int[] array = new int[terms];
            for (int i = 0; i < terms; i++) {
                array[i] = sc.nextInt();
                if (array[i] == 0) {
                    continue;
                } else {
                    degree = i;
                }
            }
            System.out.println(degree);
        }
    }
}
