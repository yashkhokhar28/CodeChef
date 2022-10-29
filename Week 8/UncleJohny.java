/* package codechef; // don't place package name! */

import java.util.Arrays;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class UncleJohny {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            int index = sc.nextInt();
            int result = array[index - 1];
            Arrays.sort(array);
            for (int i = 0; i < n; i++) {
                if (array[i] == result) {
                    result = i + 1;
                }
            }
            System.out.println(result);
        }
    }
}
