/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
Problem
Read problems statements in Mandarin Chinese, Russian, Vietnamese and Bengali as well.
Chef is stuck in the wavey world of polynomials. You are given all NN roots of a polynomial P(x) = \prod_{i=1}^N (x - a_i)P(x)=∏
i=1
N
​
 (x−a
i
​
 ). The roots are pairwise distinct integers, but they are not given in any particular order.

To help Chef escape, you should answer QQ queries (numbered 11 through QQ). For each valid ii, in the ii-th query, you are given an integer x_ix
i
​
  and you have to determine whether P(x_i)P(x
i
​
 ) is positive, negative or 00.

Input
The first line of the input contains two space-separated integers NN and QQ.
The second line contains NN space-separated integers a_1, a_2, \ldots, a_Na
1
​
 ,a
2
​
 ,…,a
N
​
 .
QQ lines follow. For each valid ii, the ii-th of these lines contains a single integer x_ix
i
​
  describing the ii-th query.
Output
For each query, print a single line containing the string "POSITIVE", "NEGATIVE" or "0" (without quotes) describing the value of the polynomial for the ii-th query.*/
/* Name of the class has to be "Main" only if the class is public. */
public class TheWave {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> size = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
        int q = size.get(1);
        int n = size.get(0);
        List<Integer> polynomial = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
        Collections.sort(polynomial);
        Out:
        while (q-- > 0) {
            int x = Integer.parseInt(bufferedReader.readLine());
            int l = 0, r = n - 1, m = (l + r) / 2;
            while (true) {
                m = (r + l) / 2;
                if (r < l) break;
                if (x > polynomial.get(m)) {
                    l = m + 1;
                } else if (x < polynomial.get(m)) {
                    r = m - 1;
                } else {
                    System.out.println(0);
                    continue Out;
                }
            }
            if (x > polynomial.get(0)) m++;
            int neg = n - m;
            if (neg % 2 == 0) System.out.println("POSITIVE");
            else System.out.println("NEGATIVE");
        }

    }
}
