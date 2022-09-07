/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/*---Defenation---
Chefland has 22 different types of coconut, type AA and type BB. Type AA contains only x_ax
a
​
  milliliters of coconut water and type BB contains only x_bx
b
​
  grams of coconut pulp. Chef's nutritionist has advised him to consume X_aX
a
​
  milliliters of coconut water and X_bX
b
​
  grams of coconut pulp every week in the summer. Find the total number of coconuts (type AA + type BB) that Chef should buy each week to keep himself active in the hot weather.
 */
/* Name of the class has to be "Main" only if the class is public. */
public class SummerHeat {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int Xa = sc.nextInt();
            int Xb = sc.nextInt();
            int req1 = (Xa / xa);
            int req2 = (Xb / xb);
            System.out.println(req1 + req2);
        }
    }
}
