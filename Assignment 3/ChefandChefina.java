/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/*Given the time control of a chess match as a + ba+b, determine which format of chess out of the given 44 it belongs to.

1)1) Chef if a + b \lt 3a+b<3

2)2) Cfenia if 3 \leq a + b \leq 103≤a+b≤10

3)3) Chefina if 11 \leq a + b \leq 6011≤a+b≤60

4)4) Cf if 60 \lt a + b60<a+b*/
public class ChefandChefina {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a + b < 3) {
                System.out.println("1");
            } else if (a + b >= 3 && a + b <= 10) {
                System.out.println("2");
            } else if (a + b >= 11 && a + b <= 60) {
                System.out.println("3");
            } else if (a + b > 60) {
                System.out.println("4");
            }
        }
    }
}
