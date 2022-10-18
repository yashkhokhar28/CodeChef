/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// Chef likes to play with cards a lot. Today, he's playing a game with three cards. Each card has a letter written on the top face and another (possibly identical) letter written on the bottom face. Chef can arbitrarily reorder the cards and/or flip any of the cards in any way he wishes (in particular, he can leave the cards as they were). He wants to do it in such a way that the letters on the top faces of the cards, read left to right, would spell out the name of his favorite friend Bob.

// Determine whether it is possible for Chef to spell "bob" with these cards.

// Input
// The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
// The first line of each test case contains a single string with length 33 denoting the characters written on the top faces of the first, second and third card.
// The second line contains a single string with length 33 denoting the characters written on the bottom faces of the first, second and third card.
// Output
// For each test case, print a single line containing the string "yes" (without quotes) if Chef can spell "bob" or "no" (without quotes) if he cannot.
public class SpellBob {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {

			String s1 = br.readLine();
			String s2 = br.readLine();
			if ((s1.charAt(0) == 'b' || s2.charAt(0) == 'b') && (s1.charAt(1) == 'o' || s2.charAt(1) == 'o')
					&& (s1.charAt(2) == 'b' || s2.charAt(2) == 'b'))
				System.out.println("yes");
			else if ((s1.charAt(0) == 'b' || s2.charAt(0) == 'b') && (s1.charAt(1) == 'b' || s2.charAt(1) == 'b')
					&& (s1.charAt(2) == 'o' || s2.charAt(2) == 'o'))
				System.out.println("yes");
			else if ((s1.charAt(0) == 'o' || s2.charAt(0) == 'o') && (s1.charAt(1) == 'b' || s2.charAt(1) == 'b')
					&& (s1.charAt(2) == 'b' || s2.charAt(2) == 'b'))
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
