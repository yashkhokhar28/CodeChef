/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
Problem
###Statement In a far away Galaxy of Milky Way, there was a planet Mars where the sport of Competitive Coding was very popular. According to legends, there lived a setter known to give advanced array problems disguised as cakewalk problems.Now he challenged you to solve the given problem.

You are given an array AA of NN integers. You can perform the following mixing operation zero or more times: select any pair (i,j) and make A[i]=A[i]+A[j].

You wants to make the values of array pairwise distinct. Find the minimum number of operations.

###Input:

The first line contains an integer TT, denoting the number of test cases. The TT test cases then follow:
The first line of each test case contains a single integer NN denoting the number of elements in the given array.
The second line contains NN space-separated integers.
###Output: For each test case, output a single line containing the answer.

###Subtasks*/
/* Name of the class has to be "Main" only if the class is public. */
public class DistinctValues {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(bufferedReader.readLine());
            ;
            List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
            int[] a = h.stream().mapToInt(Integer::intValue).toArray();
            System.out.println(minimumOperations(a, p));
        }
    }

    private static int minimumOperations(int[] a, int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (mp.get(a[i]) != null) {
                int x = mp.get(a[i]);
                mp.put(a[i], ++x);
            } else mp.put(a[i], 1);
        }

        int count = 0;
        for (HashMap.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > 1) {
                count += (entry.getValue() - 1);
            }
        }
        return count;
    }
}
