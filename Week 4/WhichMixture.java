/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
/*Chef has AA units of solid and BB units of liquid. He combines them to create a mixture. What kind of mixture does Chef produce: a solution, a solid, or a liquid?

A mixture is called :

A solution if A \gt 0A>0 and B \gt 0B>0,

A solid if B = 0B=0, or

A liquid if A = 0A=0*/
public class WhichMixture {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > 0 && b > 0) {
                System.out.println("Solution");
            }
            if (b == 0 && a != 0) {
                System.out.println("Solid");
            }
            if (a == 0 && b != 0) {
                System.out.println("Liquid");
            }
        }
    }
}
