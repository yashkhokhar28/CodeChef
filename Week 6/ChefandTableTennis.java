/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
// Chef likes to play table tennis.He found some statistics of matches which described who won the points in order.A game shall be won by the player first scoring 11 points except in the case when both players have 10 points each,then the game shall be won by the first player subsequently gaining a lead of 2 points.Could you please help the Chef find out who the winner was from the given statistics?(It is guaranteed that statistics represent always a valid,finished match.)
public class ChefandTableTennis {
        public static void main(String[] args) throws java.lang.Exception {
                // your code goes here
                Scanner scan = new Scanner(System.in);

                // Get the number of test cases
                int noOfTestCases = Integer.parseInt(scan.nextLine());

                for (int i = 0; i < noOfTestCases; i++) {
                        // Get the input pattern and convert it to character array for further
                        // processing
                        String seqOfPlays = scan.nextLine();

                        char[] plays = seqOfPlays.toCharArray();
                        boolean win = false;
                        int sum = 0;
                        int totalNoOfPlays = 0;

                        // Iterate through the input from left to right

                        while (totalNoOfPlays < plays.length) {
                                int addValue = 1;
                                if (plays[totalNoOfPlays] == '0') {
                                        addValue = 0;
                                }
                                totalNoOfPlays++;
                                sum += addValue;

                                // Case when the number of points by our player and opponent are 10
                                if (sum == 10 && totalNoOfPlays - sum == 10) {
                                        // Check for the case when the player subsequently leads by 2 points
                                        int gain = 0;
                                        for (int j = totalNoOfPlays; j <= plays.length - 1; j++) {
                                                int prevGain = gain;
                                                if (plays[j] == '1') {
                                                        gain += 1;
                                                } else {
                                                        gain += -1;
                                                }
                                                if (gain != 0 && gain >= prevGain && gain >= 2) {
                                                        win = true;
                                                        break;
                                                } else if (gain != 0 && gain <= prevGain && gain <= -2) {
                                                        break;
                                                }
                                        }
                                        break;
                                } else if (sum == 11) {
                                        // Player wins when he gains 11 points
                                        win = true;
                                        break;
                                } else if (totalNoOfPlays - sum == 11) {
                                        // Player loses when the opponent gains 11 points
                                        break;
                                }
                        }
                        if (win) {
                                System.out.println("WIN");
                        } else {
                                System.out.println("LOSE");
                        }
                }
        }
}
