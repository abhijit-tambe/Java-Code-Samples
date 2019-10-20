/*Given a number N, let the reverse of the number be R. The task is to print the output of the Expression power(N,R), where pow function represents N raised to power R.
Note: As answers can be very large, print the result modulo 1000000007.

Input Format:
The first line of the input consists of an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of a single line containing an integer N.

Output Format:
Corresponding to each test case, print in a new line, the output of the expression pow as described above.

Your Task:
This is a function problem. You just need to complete the function pow that takes two parameters N and R and returns power of (N to R)mod(1000000007)

Constraints:
1 <= T <= 103
1 <= N <= 105

Example:
Input:
2
2
12

Output:
4
864354781

Explanation:
Testcase 1: The reverse of 2 is 2 and after raising power of 2 by 2 we get 4 which gives remainder as 4 by dividing 1000000007.
 * */
package gfgdsa.recurssion;

public class PowerOfNumbers {
public static long powof(int n ,int p) {
	if(p<1) {
		return 1;
	}
	return n%1000000007*(powof(n,p-1)%1000000007)%1000000007;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =12;
		int n1=n;
		int m=0;
		while(n>0) {
			m=m*10+n%10;
			n/=10;
		}
			System.out.println(powof(n1,m));
	}

}
