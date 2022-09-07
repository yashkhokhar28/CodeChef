/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/*---Defenation---
Chef is a big fan of Coldplay. Every Sunday, he will drive to a park taking MM minutes to reach there, and during the ride he will play a single song on a loop. Today, he has got the latest song which is in total SS minutes long. He is interested to know how many times will he be able to play the song completely.
 */
/* Name of the class has to be "Main" only if the class is public. */
public class Coldplay {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int m = sc.nextInt();
            int s = sc.nextInt();
            double song = Math.floor(m / s);
            System.out.println((int) song);
        }
    }
}
