/*
 * Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. First line of each test case contains an integer N denoting the size of the array. Then in the next line are N space separated values of the array A.

Output:
For each test case in a new  line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.
Note: The output should be based on 1-based indexing, i.e. if the equilibrium point occurs at 1st position then output would be 1.

User Task:
The task is to complete the function equilibriumPoint() which returns the point of equilibrium.

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= Ai <= 108

Example:
Input:
2
1
1
5
1 3 5 2 2

Output:
1
3

Explanation:
Testcase 1: Since its the only element hence its the only equilibrium point.
Testcase 2: For second test case equilibrium point is at position 3 as elements below it (1+3) = elements after it (2+2).
 * 
 * 
 * */

package gfgdsa.arrays;

public class EquilibrimPoint {

	public static int equilibriumPoint(long arr[], int n) {
		if (n == 1) {
			return 1;
		}

		// O(n^2) Time complexity
//		for (int i = 1; i < n; i++) {
//			int lsum = 0;
//			int rsum = 0;
//			for (int j = 0; j < i; j++) {
//				lsum += arr[j];
//			}
//			for (int k = n - 1; k > i; k--) {
//				rsum += arr[k];
//			}
//			if (lsum == rsum) {
//				return i + 1;
//			}
//		}

		// optimised O(n)

		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < n - 2; i++)
			sum1 += (int) arr[i];

		int start = 1;
		int end = n - 1;
		while (start < end) {
			sum2 += arr[end];
			if (sum2 == sum1) {
				return end;
			}
			sum1 -= arr[end - 2];
			end--;

		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[] = { 1, 3, 5, 2, 2 };
		System.out.println(equilibriumPoint(arr, arr.length));

	}
}
