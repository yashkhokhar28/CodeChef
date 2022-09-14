/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/*Write a program, which takes an integer N and if the number is less than 10 then display "Thanks for helping Chef!" otherwise print "-1".*/
/* Name of the class has to be "Main" only if the class is public. */
public class HelpingChef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            if (n < 10) {
                System.out.println("Thanks for helping Chef!");
            } else {
                System.out.println(-1);
            }
        }
    }
}
