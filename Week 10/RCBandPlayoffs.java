/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*Problem
Team RCB has earned XX points in the games it has played so far in this year's IPL. To qualify for the playoffs they must earn at least a total of YY points. They currently have ZZ games left, in each game they earn 22 points for a win, 11 point for a draw, and no points for a loss.

Is it possible for RCB to qualify for the playoffs this year?

Input Format
First line will contain TT, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, three integers X , Y, ZX,Y,Z.
Output Format
For each test case, output in one line YES if it is possible for RCB to qualify for the playoffs, or NO if it is not possible to do so.

Output is case insensitive, which means that "yes", "Yes", "YEs", "no", "nO" - all such strings will be acceptable.*/

/* Name of the class has to be "Main" only if the class is public. */
public class RCBandPlayoffs {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            List<Integer> info = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
            System.out.println((info.get(2) * 2) + info.get(0) < info.get(1) ? "NO" : "YES");
        }
    }
}
