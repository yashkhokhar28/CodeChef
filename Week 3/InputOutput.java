/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/*Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 4242. All numbers at input are integers of one or two digits.*/
/* Name of the class has to be "Main" only if the class is public. */
public class InputOutput {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 42) {
            System.out.println(n);
            n = sc.nextInt();
        }
    }
}
