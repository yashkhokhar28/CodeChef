/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
Problem
Read problems statements in Mandarin Chinese and Russian as well.
There are 100 houses located on a straight line. The first house is numbered 1 and the last one is numbered 100. Some M houses out of these 100 are occupied by cops.

Thief Devu has just stolen PeePee's bag and is looking for a house to hide in.

PeePee uses fast 4G Internet and sends the message to all the cops that a thief named Devu has just stolen her bag and ran into some house.

Devu knows that the cops run at a maximum speed of x houses per minute in a straight line and they will search for a maximum of y minutes. Devu wants to know how many houses are safe for him to escape from the cops. Help him in getting this information.

Input
First line contains T, the number of test cases to follow.

First line of each test case contains 3 space separated integers: M, x and y.

For each test case, the second line contains M space separated integers which represent the house numbers where the cops are residing.

Output
For each test case, output a single line containing the number of houses which are safe to hide from cops.*/
/* Name of the class has to be "Main" only if the class is public. */
public class CopsandtheThiefDevu {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            List<Integer> info = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
            List<Integer> house = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
            Collections.sort(house);
            List<Integer> remaining = new ArrayList<>();
            for (int j = 1; j <= 100; j++) remaining.add(j);
            int houses = info.get(1) * info.get(2);
            int min = 0, max = 0;
            for (int j = 0; j < house.size(); j++) {
                min = Math.max(house.get(j) - houses, 0);
                max = Math.min(house.get(j) + houses, 100);
                for (int k = min; k <= max; k++) {
                    boolean remove = remaining.remove(new Integer(k));
                }
            }
            System.out.println(remaining.size());
        }
    }
}
