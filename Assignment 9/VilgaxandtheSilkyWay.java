/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*Problem
Vilgax is an intergalactic alien warlord and conqueror. He is out on a quest to destroy all the planets in the Silky Way Galaxy. There are 100100 planets in the Silky Way Galaxy arranged in a straight line numbered from 11 to 100100. Vilgax sends NN monsters across planets to destroy them. Given an array AA of size NN, where A_iA 
i
​
  denotes the initial planet where the i^{th}i 
th
  monster is located. The initial planets where monsters are located are already destroyed. Each monster can destroy PP planets in one hour. A monster can only travel in a straight line in any direction and will destroy all the planets in his path. A monster can travel only for HH hours after which it exhausts. Determine the number of safe planets that are not on the verge of destruction.

Input Format
The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
The first line of each test case contains 33 space-separated integers: N, P, HN,P,H.
The second line of each test case contains NN space-separated integers which represent the initial location of the monsters.
Output Format
For each test case, output in a single line the number of safe planets.*/
/* Name of the class has to be "Main" only if the class is public. */
public class VilgaxandtheSilkyWay {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            List<Integer> info = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
            List<Integer> planet = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
            Collections.sort(planet);
            List<Integer> remaining = new ArrayList<>();
            for (int j = 1; j <= 100; j++) remaining.add(j);
            int planets = info.get(1) * info.get(2);
            int min = 0, max = 0;
            for (int j = 0; j < planet.size(); j++) {
                min = Math.max(planet.get(j) - planets, 0);
                max = Math.min(planet.get(j) + planets, 100);
                for (int k = min; k <= max; k++) {
                    remaining.remove(new Integer(k))
                }
            }
            System.out.println(remaining.size());
        }
    }
}
