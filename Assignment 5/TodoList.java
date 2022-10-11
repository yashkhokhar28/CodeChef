/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

// /* Name of the class has to be "Main" only if the class is public. */
// Chef has made a To-Do list: a list of all the pending tasks that he has to complete. The list is in the increasing order of time taken to finish the tasks. Chef begins from the starting of the list.

// Given an array AA of size NN denoting the list of the pending tasks. Each task is an integer between 11 and NN. The tasks numbered from 11 to 77 are classified as top priority tasks. Chef needs to know the minimum number of tasks he has to complete in order to get all the top priority tasks accomplished. Can you help him to do so?
public class TodoList {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			int size = Integer.parseInt(bufferedReader.readLine());
			List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
					.map(Integer::parseInt)
					.collect(toList());

			int count = 0;
			;
			for (int j = size; j - 1 > 0; j--) {
				if (h.get(j - 1) <= 7)
					break;
				else
					count++;
			}
			System.out.println(size - count);
		}
	}
}