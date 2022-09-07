/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/*---Defenation---
The most important part of a GSM network is so called Base Transceiver Station (BTS). These transceivers form the areas called cells (this term gave the name to the cellular phone) and every phone connects to the BTS with the strongest signal (in a little simplified view). Of course, BTSes need some attention and technicians need to check their function periodically.

The technicians faced a very interesting problem recently. Given a set of BTSes to visit, they needed to find the shortest path to visit all of the given points and return back to the central company building. Programmers have spent several months studying this problem but with no results. They were unable to find the solution fast enough. After a long time, one of the programmers found this problem in a conference article. Unfortunately, he found that the problem is so called "Traveling Salesman Problem" and it is very hard to solve. If we have NN BTSes to be visited, we can visit them in any order, giving us N!N! possibilities to examine. The function expressing that number is called factorial and can be computed as a product:

1.2.3.4....N1.2.3.4....N. The number is very high even for a relatively small NN.

The programmers understood they had no chance to solve the problem. But because they have already received the research grant from the government, they needed to continue with their studies and produce at least some results. So they started to study behaviour of the factorial function.

For example, they defined the function ZZ. For any positive integer NN, ZZ(NN) is the number of zeros at the end of the decimal form of number N!N!. They noticed that this function never decreases. If we have two numbers N_1 < N_2N
1
​
 <N
2
​
  then Z(N_1) \le Z(N_2)Z(N
1
​
 )≤Z(N
2
​
 ). It is because we can never "lose" any trailing zero by multiplying by any positive number. We can only get new and new zeros. The function ZZ is very interesting, so we need a computer program that can determine its value efficiently.
 */
/* Name of the class has to be "Main" only if the class is public. */
public class Factorial {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            int zeros = 0;
            while (n > 0) {
                zeros = zeros + n / 5;
                n = n / 5;
            }
            System.out.println(zeros);
        }
    }
}
