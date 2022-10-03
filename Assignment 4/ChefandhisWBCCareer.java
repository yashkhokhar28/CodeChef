/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
/*Chef has been participating in World's Best Chef (WBC) for 77 years in a row now. Chef calls his WBC career successful if the number of times he has won is strictly greater than the number of times he didn't. WBC takes place annually. Chef's WBC career is described as an array of containing 77 elements. The i^{th}i
th
  element a_ia
i
​
  is 11 if Chef has won in the i^{th}i
th
  year and 00 otherwise.

Find if Chef's career was successful or not.*/
public class ChefandhisWBCCareer {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            int count_zero = 0;
            int count_one = 0;
            int[] array = new int[7];
            for (int i = 0; i < array.length; i++) {

                array[i] = sc.nextInt();

                if (array[i] == 0) {
                    count_zero++;
                }
                if (array[i] == 1) {
                    count_one++;
                }
            }
            if (count_one > count_zero) {
                System.out.println("Yes");
            } else if (count_one < count_zero) {
                System.out.println("No");
            }
        }
    }
}
