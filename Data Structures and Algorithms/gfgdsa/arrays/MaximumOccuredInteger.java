/*
 * Given N integer ranges, the task is to find the maximum occurring integer in these ranges. If more than one such integer exits, print the smallest one. The ranges are given as two arrays L[] and R[].  L[i] consists of starting point of range and R[i] consists of corresponding end point of the range.

For example consider the following ranges.
L[] = {2, 1, 3}, R[] = {5, 3, 9)
Ranges represented by above arrays are.
[2, 5] = {2, 3, 4, 5}
[1, 3] = {1, 2, 3}
[3, 9] = {3, 4, 5, 6, 7, 8, 9}
The maximum occurred integer in these ranges is 3.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer n denoting the size of the ranges. The next two lines contain the n space separated elements of L and R respectively.

Output:
Print the smallest maximum occured integer in all the ranges.

User Task:
The task is to complete the function maxOccured() which returns the maximum occured integer in all ranges.

Constraints:
1 <= T <= 102
1 <= n <= 106
0 <= L[i], R[i] <= 106

Example:
Input:
2
4
1 4 3 1
15 8 5 4
5
1 5 9 13 21
15 8 12 20 30

Output:
4
5

Explanation:
Testcase 1: 4 is the most occurring element after considering all the ranges. So, output is 4.
 * */

package gfgdsa.arrays;

import java.util.Arrays;

public class MaximumOccuredInteger {

	public static int maxOccured(int L[], int R[], int n, int maxx) {
		int temp[] = new int[maxx + 1];
		for (int i = 0; i <= n; i++) {
			temp[i] = 0;
		}
		for (int i = 0; i < L.length; i++) {
			int low = L[i];
			int high = R[i];
			while (low <= high) {
				temp[low]++;

				low++;

			}

		}
		System.out.println(Arrays.toString(temp));
		int max = 0;
		for (int a : temp) {
			max = Math.max(a, max);
		}
		int val = 0;

		for (int i = 0; i <= temp.length; i++) {
			if (temp[i] == max) {
				val += i;
				break;
			}
		}
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int L[] = { 1, 5, 9, 13, 21 };
		int R[] = { 15, 8, 12, 20, 30 };
		System.out.println(maxOccured(L, R, L.length, 30));
	}

}
