/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
/*Write a program that takes in a letterclass ID of a ship and display the equivalent string class description of the given ID. Use the table below.*/
public class IdandShip {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            char ch = sc.next().charAt(0);
            if (ch == 'b' || ch == 'B') {
                System.out.println("BattleShip");
            }
            if (ch == 'c' || ch == 'C') {
                System.out.println("Cruiser");
            }
            if (ch == 'd' || ch == 'D') {
                System.out.println("Destroyer");
            }
            if (ch == 'f' || ch == 'F') {
                System.out.println("Frigate");
            }
        }
    }
}
