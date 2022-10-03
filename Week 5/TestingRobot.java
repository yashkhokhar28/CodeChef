/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
/*Chef has bought a new robot, which will be used for delivering dishes to his customers. He started testing the robot by letting it move on a line.

Initially, the robot is placed at the coordinate x = Xx=X. Then, it should execute a sequence of NN commands, described by a string SS with length NN. Each character of this string is either 'L' or 'R', denoting that the robot should walk one step to the left (decreasing xx by 11) or to the right (increasing xx by 11), respectively.

How many distinct points are visited by the robot when it has executed all the commands? A point pp is visited by the robot if pp is an integer and the robot's position before or after executing some command is x = px=p.*/
public class TestingRobot {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test > 0) {
            int size = sc.nextInt();
            int x = sc.nextInt();
            String str = sc.next();

            int right = x, left = x;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'R') x++;
                else x--;

                if (x > right) right = x;
                if (x < left) left = x;
            }
            System.out.println(right - left + 1);
            test--;
        }
    }
}
