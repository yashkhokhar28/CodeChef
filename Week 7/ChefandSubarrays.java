/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

// /* Name of the class has to be "Main" only if the class is public. */
// Chef likes problems involving arrays.Unfortunately,the last one he tried to solve didn'tquite get solved.

// Chef has an array A of N positive numbers.He wants to find the number of subarrays for which the sum and product of elements are equal.

// Please help Chef find this number.

// Input The first line of input contains an integer T denoting the number of test cases.T test cases follow.The first line of each test contains the integer N.The next line contains N integers—A1,A2,...,AN—denoting the array.Output For each test case,output a single line with the answer for the instance.
public class ChefandSubarrays {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			int p = Integer.parseInt(bufferedReader.readLine());
			List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
					.map(Integer::parseInt)
					.collect(toList());
			int count = 0;
			for (int j = 0; j < p; j++) {
				int sum = h.get(j), product = h.get(j);
				for (int k = j + 1; k < p; k++) {
					if (sum == product)
						count++;
					sum = sum + h.get(k);
					product = product * h.get(k);
				}
				if (sum == product)
					count++;
			}
			System.out.println(count);
		}
	}
}
