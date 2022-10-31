/* package codechef; // don't place package name! */

import java.util.Arrays;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class IsitDerived {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int[] array1 = new int[size];
            for (int i = 0; i < size; i++) {
                array1[i] = sc.nextInt();
            }
            int[] array2 = new int[size];
            int[] array3 = new int[size];
            for (int j = 0; j < (size) / 2; j++) {
                array2[j] = array1[j];
               System.out.print(array2[j] + " ");
            }
            System.out.println(" ");
            for (int j = (array1.length / 2); j < size; j++) {
                array3[j] = array1[j];
               System.out.print(array3[j] + " ");
            }
            if (Arrays.equals(array2, array3)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
