/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// Chef has found two very old sheets of paper, each of which originally contained a string of lowercase Latin letters. The strings on both the sheets have equal lengths. However, since the sheets are very old, some letters have become unreadable.

// Chef would like to estimate the difference between these strings. Let's assume that the first string is named S1, and the second S2. The unreadable symbols are specified with the question mark symbol '?'. The difference between the strings equals to the number of positions i, such that S1i is not equal to S2i, where S1i and S2i denote the symbol at the i the position in S1 and S2, respectively.

// Chef would like to know the minimal and the maximal difference between the two strings, if he changes all unreadable symbols to lowercase Latin letters. Now that you're fully aware of Chef's programming expertise, you might have guessed that he needs you help solving this problem as well. Go on, help him!
public class ChefandTwoStrings {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            int c = 0, t = 0;
            for (int i = 0; i < s1.length(); i++) {
                if ((s1.charAt(i) == '?' && s2.charAt(i) == '?') || (s1.charAt(i) == '?' && s2.charAt(i) != '?')
                        || (s2.charAt(i) == '?' && s1.charAt(i) != '?'))
                    c++;
                else if (s1.charAt(i) != s2.charAt(i) && s1.charAt(i) != '?' && s2.charAt(i) != '?')
                    t++;
            }
            System.out.println(t + " " + (t + c));

        }
    }
}