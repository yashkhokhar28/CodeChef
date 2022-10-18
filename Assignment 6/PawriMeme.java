/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

// Problem
// On the occasion of his birthday, Chef has decided to throw a grand party at Babloo Resort. Chef is a huge fan of the popular "pawri" trend on Instagram. So, he decided to modify the invitation card represented by a string SS, by changing each of the substrings that spell "party" to "pawri". Determine the resulting string.

// Input Format
// The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
// The first and only line of each test case contains a single string SS.
// Output Format
// For each test case, print a single line containing the modified string.
public class PawriMeme {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			String p = bufferedReader.readLine();
			p = p.replaceAll("party", "pawri");
			System.out.println(p);
		}
	}
}
