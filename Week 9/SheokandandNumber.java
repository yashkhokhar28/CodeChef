/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

/*
Problem
Read problems statements in Hindi, Mandarin chinese , Russian and Vietnamese as well.
Sheokand is good at mathematics. One day, to test his math skills, Kaali gave him an integer NN. To impress Kaali, Sheokand has to convert NN into an integer MM that can be represented in the form 2^x + 2^y2
x
 +2
y
  (where xx and yy are non-negative integers such that x \neq yx=y). In order to do that, he can perform two types of operations:

add 11 to NN
subtract 11 from NN
However, Sheokand is preparing for his exams. Can you help him find the minimum number of operations required to convert NN into a valid integer MM?

Input
The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
The first and only line of each testcase contains a single integer NN.
Output
For each test case, print a single line containing one integer — the minimum required number of operations.*/
/* Name of the class has to be "Main" only if the class is public. */
public class SheokandandNumber {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i <= 30; i++) {
            for (int j = 0; j <= 30; j++) {
                if (i != j) set.add((int) (Math.pow(2, i) + Math.pow(2, j)));
            }
        }
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            if (n < 3) {
                System.out.println(3 - n);
                continue;
            }
            System.out.println(Math.min(n - set.floor(n), set.higher(n) - n));
        }
    }
}
