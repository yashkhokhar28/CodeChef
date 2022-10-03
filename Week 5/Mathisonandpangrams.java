/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
/*Mathison recently inherited an ancient papyrus that contained some text. Unfortunately, the text was not a pangram. Now, Mathison has a particular liking for holoalphabetic strings and the text bothers him. The good news is that Mathison can buy letters from the local store in order to turn his text into a pangram.

However, each letter has a price and Mathison is not very rich. Can you help Mathison find the cheapest way to obtain a pangram?*/
public class Mathisonandpangrams {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int[] n = new int[26];
            for (int i = 0; i < n.length; i++) {
                n[i] = sc.nextInt();
            }
            String m = "abcdefghijklmnopqrstuvwxyz";
            String str = sc.next();
            int sum = 0;
            for (int i = 0; i < m.length(); i++) {
                if (!str.contains(Character.toString(m.charAt(i)))) {
                    sum += n[i];

                }
            }
            System.out.println(sum);
        }
    }
}
