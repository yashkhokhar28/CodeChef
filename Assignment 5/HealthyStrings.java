/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// Chef is currently working as an intern at Toonpur Health Department. Recently he is assigned the task to identify healthy strings.

// A string is considered healthy if, when split into two halves from the middle, the two halves have the same characters and the frequency of each character is also the same. If the string is of odd length, then the middle character is ignored and the string is split into two halves around the middle. For example, string "aefefa" is healthy as the two halves "aef" and "efa" have the same characters and frequency of each character is also the same. On the other hand, the string "defer" is not healthy as in the two halves "de" and "er", characters 'd' and 'r' do not match.

// Chef is facing difficulty in identifying which string is healthy. Can you help him with this task?
public class HealthyStrings {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		for (int t = 0; t < test; t++) {
			String st = sc.next();
			int n = st.length();

			char[] arr1 = new char[n / 2];
			for (int i = 0; i < n / 2; i++) {
				arr1[i] = st.charAt(i);
			}

			char[] arr2 = new char[n / 2];
			if (n % 2 == 0) {
				int k = 0;
				for (int j = n / 2; j < n; j++) {
					arr2[k] = st.charAt(j);
					k++;
				}
			} else {
				int k = 0;
				for (int j = (n / 2) + 1; j < n; j++) {
					arr2[k] = st.charAt(j);
					k++;
				}
			}

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			int count = 0;
			for (int i = 0; i < n / 2; i++) {
				if (arr1[i] != arr2[i]) {
					count++;
				}
			}

			if (count == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}
