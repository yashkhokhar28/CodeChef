/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/*Chef has just started Programming, he is in first year of Engineering. Chef is reading about Relational Operators.
Relational Operators are operators which check relatioship between two values. Given two numerical values A and B you need to help chef in finding the relationship between them that is,

First one is greater than second or, First one is less than second or, First and second one are equal.*/
/* Name of the class has to be "Main" only if the class is public. */
public class ChefAndOperators {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else if (a == b) {
                System.out.println("=");
            }
        }
    }
}
