/* package codechef; // don't place package name! */

/*
Chef opened a company which manufactures cars and bikes. Each car requires 44 tyres while each bike requires 22 tyres. Chef has a total of NN tyres (NN is even). He wants to manufacture maximum number of cars from these tyres and then manufacture bikes from the remaining tyres.

Chef's friend went to Chef to purchase a bike. If Chef's company has manufactured even a single bike then Chef's friend will be able to purchase it.

Determine whether he will be able to purchase the bike or not.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Tyres {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int i = 1; i <= testcases; i++) {
            int tyres = sc.nextInt();
            if (tyres % 4 >= 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
