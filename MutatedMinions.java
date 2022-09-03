/* package codechef; // don't place package name! */
/*---Defenation---
Gru has not been in the limelight for a long time and is, therefore, planning something particularly nefarious. Frustrated by his minions' incapability which has kept him away from the limelight, he has built a transmogrifier — a machine which mutates minions.

Each minion has an intrinsic characteristic value (similar to our DNA), which is an integer. The transmogrifier adds an integer K to each of the minions' characteristic value.

Gru knows that if the new characteristic value of a minion is divisible by 7, then it will have Wolverine-like mutations.

Given the initial characteristic integers of N minions, all of which are then transmogrified, find out how many of them become Wolverine-like.*/

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
public class MutatedMinions {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int count = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                if ((m + k) % 7 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
