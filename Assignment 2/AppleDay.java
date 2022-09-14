/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/*You have NN Apples.You can eat KK apples on a single day.What's the minimum number of days required to eat all apples?*/
/* Name of the class has to be "Main" only if the class is public. */
public class AppleDay {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            double n = sc.nextInt();
            double k = sc.nextInt();
            double s = Math.ceil(n / k);
            System.out.println((int) s);
        }
    }
}
