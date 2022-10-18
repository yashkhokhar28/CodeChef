/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

// Problem Chef has a certain liking towards certain English characters.He considers these characters beautiful.You are given a string SS consisting of all the characters Chef finds beautiful.

// Chef considers a word divinedivine if each and every character present in the word is beautiful.Given a list of NN words,determine which of them are divinedivine.

// Input Format The first line of the input contains a string SS,consisting of beautiful characters.Each character in SS will appear only once.The second line of the input contains an integer NN.Each of the following NN lines contains a single string P_iP i ​,denoting the i^{th}i th word in the list.Output Format For each of the NN words,output"Yes"(without quotes)if the word is divine and"No"(without quotes)otherwise.
public class DivineWords {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String divine = bufferedReader.readLine();
		List<String> divineList = new ArrayList<String>(Arrays.asList(divine.split("")));
		int n = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			String str = bufferedReader.readLine();
			List<String> strList = new ArrayList<String>(Arrays.asList(str.split("")));
			System.out.println(divineList.containsAll(strList) ? "Yes" : "No");
		}
	}
}
