/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class ChefandParking {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            int a = 0, b = 0, countone = 0, streak = 0, count = 0;
            String string = "";
            a = sc.nextInt();
            b = sc.nextInt();
            string = sc.next();
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '1') {
                    countone++;
                    count++;
                    if (count > streak) {
                        streak = count;
                    }
                } else {
                    count = 0;
                }
            }
            System.out.println((countone * a) + (streak * b));
        }
    }
}
