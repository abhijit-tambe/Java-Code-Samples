/*Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Input:
The first line of input contains an integer T denoting the number of test cases.
 The description of T test cases follows. The first line of each test case contains 
 
 a single integer N denoting the size of array. The second line contains N space-separated 
 integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.

Constraints:
1 ≤ T ≤ 110
1 ≤ N ≤ 106
-107 ≤ A[i] <= 107

Example:
Input
2
5
1 2 3 -2 5
4
-1 -2 -3 -4
Output
9
-10

Explanation:
Testcase 1: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
 * */

package gfgps.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KadensLargestSumOfSubarray {

	public static void LargestSumSubarray(int[]a,int n) {
		//msf = max so far, meh = max ending here
		int msf=0,meh=0;
		boolean flag =false;
		for(int i=0;i<n;i++) {
			meh = meh+a[i];
			if(meh<0) {
				meh=0;
			}
			if(msf<meh) {
				msf = meh;
				flag=true;
			}
		}
		if(!flag) {
			Arrays.sort(a);
			System.out.println(a[a.length-1]);
		}
		else
		System.out.println(msf);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
//			int s = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			LargestSumSubarray(arr, n);
		}

	}

}
