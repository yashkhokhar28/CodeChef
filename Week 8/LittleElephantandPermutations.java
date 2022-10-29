/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class LittleElephantandPermutations {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int count = 0, p = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (arr[i] > arr[j] && j > i) {
                        count++;
                    }
                }
            }
            for (int i = 0; i < n - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    p++;
                }
            }
            if (p == count) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
