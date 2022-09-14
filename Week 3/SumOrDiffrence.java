/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/*Write a program to take two numbers as input and print their difference if the first number is greater than the second number otherwiseotherwise print their sum.*/
/* Name of the class has to be "Main" only if the class is public. */
public class SumOrDiffrence {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a - b);
        } else {
            System.out.println(a + b);
        }
    }
}
