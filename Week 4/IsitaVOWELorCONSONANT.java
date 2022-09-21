/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
/*Write a program to take a character (C)(C) as input and check whether the given character is a vowel or a consonant.

NOTE:-NOTE:− Vowels are 'A', 'E', 'I', 'O', 'U'. Rest all alphabets are called consonants.*/
public class IsitaVOWELorCONSONANT {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
