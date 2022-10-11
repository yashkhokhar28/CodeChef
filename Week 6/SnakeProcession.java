/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// The annual snake festival is upon us,and all the snakes of the kingdom have gathered to participate in the procession.Chef has been tasked with reporting on the procession,and for this he decides to first keep track of all the snakes.When he sees a snake first,it'll be its Head,and hence he will mark a'H'.The snakes are long,and when he sees the snake finally slither away,he'll mark a 'T' to denote its tail.In the time in between,when the snake is moving past him,or the time between one snake and the next snake,he marks with'.'s.

// Because the snakes come in a procession,and one by one,a valid report would be something like"..H..T...HTH....T.",or"...",or"HT",whereas"T...H..H.T","H..T..H","H..H..T..T"would be invalid reports(See explanations at the bottom).

// Formally,a snake is represented by a'H'followed by some(possibly zero)'.'s,and then a'T'.A valid report is one such that it begins with a(possibly zero length)string of'.'s,and then some(possibly zero)snakes between which there can be some'.'s,and then finally ends with some(possibly zero)'.'s.

// Chef had binged on the festival food and had been very drowsy.So his report might be invalid.You need to help him find out if his report is valid or not.
public class SnakeProcession {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String str = sc.next();
			int count = 0;
			boolean flag = true;
			for (int i = 0; i < n; i++) {
				if (str.charAt(i) == 'H' && count == 0) {
					count++;
				} else if (str.charAt(i) == 'H' && count != 0) {
					flag = false;
					break;
				} else if (str.charAt(i) == 'T' && count == 0) {
					flag = false;
					break;
				} else if (str.charAt(i) == 'T' && count != 0) {
					count = 0;
				}
			}
			if (flag && count == 0) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}
