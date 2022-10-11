/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// Chef recorded a video explaining his favorite recipe.However,the size of the video is too large to upload on the internet.He wants to compress the video so that it has the minimum size possible.

// Chef'svideo has NN frames initially.The value of the i^{th}i th frame is A_iA i ​.Chef can do the following type of operation any number of times:

// Choose an index ii(1\le i\le N)(1≤i≤N)such that the value of the i^{th}i th frame is equal to the value of either of its neighbors and remove the i^{th}i th frame.Find the minimum number of frames Chef can achieve.
public class CompresstheVideo {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int frames[] = new int[n];
            for (int i = 0; i < n; i++) {

                frames[i] = sc.nextInt();
            }
            int count = 0;
            for (int j = 1; j < n; j++) {
                if (frames[j] == frames[j - 1]) {
                    count++;
                }
            }
            System.out.println(n - count);
        }

    }
}
