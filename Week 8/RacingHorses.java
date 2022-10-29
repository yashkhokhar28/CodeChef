/* package codechef; // don't place package name! */

import java.util.Arrays;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class RacingHorses {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            int min = 1000000000;
            for (int i = 1; i < size; i++) {
                if (array[i] - array[i - 1] < min) {
                    min = array[i] - array[i - 1];
                }
            }
            System.out.println(min);
        }
    }
}
