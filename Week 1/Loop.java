/* package codechef; // don't place package name! */

/*---Defenation

There is a circular track of length MM consisting of MM checkpoints and MM bidirectional roads such that each road has a length of 11 unit.
Chef is currently at checkpoint AA and wants to reach checkpoint BB. Find the minimum length of the road he needs to travel.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Loop {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int i = sc.nextInt();
            int f = sc.nextInt();
            int t = sc.nextInt();
            if (i > f) {
                System.out.println(Math.min(i - f, t - i + f));
            } else {
                System.out.println(Math.min(f - i, i + t - f));
            }
        }
    }
}
