/* package codechef; // don't place package name! */

import java.lang.*;
import java.lang.reflect.Array;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class IsitDerived {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-->0){
            int [] array1 = new int[100];
            int size = sc.nextInt();
            for (int i = 0; i < size; i++) {
                array1[i] = sc.nextInt();
            }
            for (int j = size-1; j >=0; j--) {
                System.out.println(array1[j]);
            }
//            if (flag){
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
        }
    }
}
