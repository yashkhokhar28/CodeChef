/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/*Defenation---
Chef has NN slippers, LL of which are left slippers and the rest are right slippers. Slippers must always be sold in pairs, where each pair contains one left and one right slipper. If each pair of slippers cost XX rupees, what is the maximum amount of rupees that Chef can get for these slippers?
Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int x = sc.nextInt();
            if (x == 0) {
                System.out.println(l * x);
            } else {
                System.out.println((Math.min(n - l, l) * x));

            }
        }
    }
}
