/* package codechef; // don't place package name! */


/*
Problem
Read problem statements in Mandarin, Bengali, and Russian as well.
There are NN students in a class, where the ii-th student has a score of A_iA
i
​
 .

The ii-th student will boast if and only if the number of students scoring less than or equal A_iA
i
​
  is greater than the number of students scoring greater than A_iA
i
​
 .

Find the number of students who will boast.

Input Format
The first line contains TT - the number of test cases. Then the test cases follow.
The first line of each test case contains a single integer NN - the number of students.
The second line of each test case contains NN integers A_1, A_2, \dots, A_NA
1
​
 ,A
2
​
 ,…,A
N
​
  - the scores of the students.
Output Format
For each test case, output in a single line the number of students who will boast.*/
/* Name of the class has to be "Main" only if the class is public. */
public class AverageFlex {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(bufferedReader.readLine());
            List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
            int count = 0;
            for (int j = 0; j < p; j++) {
                int min = 0, max = 0;
                for (int k = 0; k < p; k++) {
                    if (h.get(k) <= h.get(j)) min++;
                    else max++;
                }
                if (min > max) count++;
            }
            System.out.println(count);
        }
    }
}
