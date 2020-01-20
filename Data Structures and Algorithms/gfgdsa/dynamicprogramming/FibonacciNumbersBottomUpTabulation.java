/*One of the rudimentary problems to understand DP is finding the nth Fibonacci number. Here, we will solve the problem using bottom-up approach.

You are given a number. You need to find Fibonacci(number).

Input Format:
The first line of input contains testcases number. . Each testcase contains a number.

Output Format:
For each testcase, in a newline, print the numberth fibonacci number.

Your Task:
You don't need to take any input. You have to complete the function findNthFibonacci.

Constraints:
1 <= testcases <= 100
1 <= number <= 92

Examples:
Input:
2
5
7
Output:
5
13
 * */
package gfgdsa.dynamicprogramming;

public class FibonacciNumbersBottomUpTabulation {
	static long dp[] = new long[100];

	// Complete this function
	public long findNthFibonacci(int number) {
		if (dp[number] > 0)
			return dp[number];
		dp[1] = 1;
		dp[2] = 1;
		for (int i = 3; i <= number; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[number];
	}
}
