/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
/*Chef usually likes to play cricket, but now, he is bored of playing it too much, so he is trying new games with strings. Chef's friend Dustin gave him binary strings SS and RR, each with length NN, and told him to make them identical. However, unlike Dustin, Chef does not have any superpower and Dustin lets Chef perform only operations of one type: choose any pair of integers (i, j)(i,j) such that 1 \le i, j \le N1≤i,j≤N and swap the ii-th and jj-th character of SS. He may perform any number of operations (including zero).

For Chef, this is much harder than cricket and he is asking for your help. Tell him whether it is possible to change the string SS to the target string RR only using operations of the given type.*/
public class PlayingwithStrings {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String r = sc.next();
            int s0 = 0;
            int s1 = 0;
            int r0 = 0;
            int r1 = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    s0++;
                }
                if (s.charAt(i) == '1') {
                    s1++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (r.charAt(i) == '0') {
                    r0++;
                }
                if (r.charAt(i) == '1') {
                    r1++;
                }
            }
            if (s0 == r0 && s1 == r1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
