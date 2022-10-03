/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
/*Chef needs to satisfy the following three criteria to get gift:

Solve at least x_1x
1
​
  problems on Codechef.
Have at least y_1y
1
​
  current rating on Codechef.
Make his last submission at most z_1z
1
​
  months ago.
You are given the number of problems solved by Chef (x_2x
2
​
 ), his current rating (y_2y
2
​
 ) and the information that he made his last submission z_2z
2
​
  months ago. Determine whether he will get the gift.*/
public class GiftforChef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int z1 = sc.nextInt();
            int z2 = sc.nextInt();
            if (x2 >= x1 && y2 >= y1 && z2 <= z1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
