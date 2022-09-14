/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/*Write a program to obtain a number NN and increment its value by 1 if the number is divisible by 4 otherwiseotherwise decrement its value by 1.*/
/* Name of the class has to be "Main" only if the class is public. */
public class DecrementOrIncrement {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 4 == 0) {
            n++;
        } else {
            n--;
        }
        System.out.println(n);
    }
}
