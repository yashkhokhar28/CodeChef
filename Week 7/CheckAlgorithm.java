import java.util.*;
import java.lang.*;
import java.io.*;
// /* Name of the class has to be "Main" only if the class is public. */
// One day,Saeed was teaching a string compression algorithm.This algorithm finds all maximal substrings which contains only one character repeated one or more times(a substring is maximal if it we cannot add one character to its left or right without breaking this property)and replaces each such substring by the string"cK",where KK is the length of the substring and cc is the only character it contains.For example,"aabaaa"is compressed to"a2b1a3".

// Saeed wanted to check if the students understood the algorithm,so he wrote a string SS on the board and asked the students if the algorithm is effective on SS,i.e.if the string created by compressing SS is strictly shorter than SS.Help them answer this question.

// Input The first line of the input contains a single integer TT denoting the number of test cases.The description of TT test cases follows.The first and only line of each test case contains a single string SS.Output For each test case,print a single line containing the string"YES"if the algorithm is effective on SS or"NO"if it is not.
public class CheckAlgorithm {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- > 0) {
			String S = input.next();
			StringBuilder br = new StringBuilder();
			int count = 0;
			char a = S.charAt(0);
			for (int i = 0; i < S.length(); i++) {
				char c = S.charAt(i);
				if (a == c) {
					count++;
				} else if (a != c || i == S.length()) {
					br.append(a);
					br.append(count);
					a = S.charAt(i);
					count = 1;
				}
			}
			br.append(a);
			br.append(count);
			String A = br.toString();
			if (S.length() > A.length()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
