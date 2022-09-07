/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while (testcase-->0){
		    int n = sc.nextInt();
		    int l = sc.nextInt();
		    int x = sc.nextInt();
		    if(x==0){
		         System.out.println(l*x);
		    } else {
		        System.out.println((Math.min(n-l,l)*x));
		       
		    } 
		}
	}
}
