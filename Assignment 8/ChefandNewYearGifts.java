/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
/*
Problem
Chef wants to give his friends Alice and Bob some gift on the occasion of new year!

He visits a gift shop with nn gifts placed in row. The i^{th}i
th
  gift has a price p_ip
i
​
 . Chef doesn't want to give the same gift to both his friends. Yet he wants the gifts to be as equal as possible, in other words he wants the absolute difference between the prices of both gifts to be as less as possible.

Help Chef in determining the least absolute difference in prices of the gifts given to Alice and Bob.

Input Format
First line of the input contains a single integer TT, the number of test cases. The description of each test case follows.
The first line of each test case contains a single integer nn.
The next line contains nn space-separated integers, i^{th}i
th
  of them denoting the price of the i^{th}i
th
  gift.
Output Format
For each test case, print the minimum absolute difference in both the gifts in a separate line.*/

/* Name of the class has to be "Main" only if the class is public. */
public class ChefandNewYearGifts {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(bufferedReader.readLine());
            List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
            Collections.sort(h);
            int diff = Integer.MAX_VALUE;
            for (int j = 0; j < p - 1; j++) {
                if (h.get(j + 1) - h.get(j) < diff) diff = h.get(j + 1) - h.get(j);
            }
            System.out.println(diff);
        }

    }
}
