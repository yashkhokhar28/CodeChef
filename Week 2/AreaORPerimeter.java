/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/*---Defenations---
Write a program to obtain length (L)(L) and breadth (B)(B) of a rectangle and check whether its area is greater or perimeter is greater or both are equal.### Input:

First line will contain the length (L)(L) of the rectangle.
Second line will contain the breadth (B)(B) of the rectangle.*/
/* Name of the class has to be "Main" only if the class is public. */
public class AreaORPerimeter {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area = l * b;
        int peri = 2 * (l + b);
        if (area > peri) {
            System.out.println("Area");
            System.out.println(area);
        } else if (peri == area) {
            System.out.println("Eq");
            System.out.println(peri);
        } else {
            System.out.println("Peri");
            System.out.println(peri);

        }
    }
}
