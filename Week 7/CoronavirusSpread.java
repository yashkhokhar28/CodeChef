/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
// /* Name of the class has to be "Main" only if the class is public. */
// There are NN people on a street(numbered 11 through NN).For simplicity,we'll view them as points on a line.For each valid ii,the position of the ii-th person is X_iX i ​.

// It turns out that exactly one of these people is infected with the virus COVID-19,but we do not know which one.The virus will spread from an infected person to a non-infected person whenever the distance between them is at most 22. If we wait long enough,a specific set of people(depending on the person that was infected initially)will become infected;let'scall the size of this set the final number of infected people.

// Your task is to find the smallest and largest value of the final number of infected people,i.e.this number in the best and in the worst possible scenario.

// Input The first line of the input contains a single integer TT denoting the number of test cases.The description of TT test cases follows.The first line of each test case contains a single integer NN.The second line contains NN space-seperated integers X_1,X_2,\ldots,X_NX 1 ​,X 2 ​,…,X N ​.Output For each test case,print a single line containing two space-separated integers―the minimum and maximum possible final number of infected people.
public class CoronavirusSpread {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			int p = Integer.parseInt(bufferedReader.readLine());
			List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
					.map(Integer::parseInt)
					.collect(toList());
			int best = p, worst = 1, count = 1;
			for (int j = 0; j + 1 < p; j++) {
				if (h.get(j + 1) - h.get(j) <= 2) {
					count++;
				} else {
					if (count < best)
						best = count;
					count = 1;
				}

				if (worst < count)
					worst = count;
			}

			if (count < best) {
				best = count;
			}

			if (count > worst) {
				worst = count;
			}
			System.out.println(best + " " + worst);
		}
	}
}
