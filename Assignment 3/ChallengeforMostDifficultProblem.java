/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
/*Problem
In a competition, there are three 33 problems: P, Q, RP,Q,R. Alice challenges Bob that problem RR will be the most difficult, whereas Bob predicts that problem QQ will be the most difficult.

You are given three integers S_P, S_Q, S_RS
P
​
 ,S
Q
​
 ,S
R
​
 , which represent the number of successful submissions of the problems P, Q, RP,Q,R. Each problem is guaranteed to have a varied amount of submissions. Decide who will win the challenge.

If Alice wins the challenge (that is, if problem RR is the most difficult), then output AliceAlice.

If Bob wins the challenge (that is, if problem QQ is the most difficult), then output BobBob.

If no one wins the challenge (since problem PP is the most difficult), output DrawDraw.

Note: The problem with the fewest successful submissions is the most difficult.*/
public class ChallengeforMostDifficultProblem {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int sp = sc.nextInt();
            int sq = sc.nextInt();
            int sr = sc.nextInt();
            if (sp < sq && sp < sr) {
                System.out.println("Draw");
            }
            if (sq < sp && sq < sr) {
                System.out.println("Bob");
            }
            if (sr < sq && sr < sp) {
                System.out.println("Alice");
            }
        }
    }
}
