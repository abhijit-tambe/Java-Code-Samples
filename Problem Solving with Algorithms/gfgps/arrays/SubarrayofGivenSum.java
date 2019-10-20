/*Given an unsorted array A of size N of non-negative integers,
find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases. 
Then T test cases follow. Each test case consists of two lines. The first line of 
each test case is N and S, where N is the size of array and S is the sum. The second 
line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such
 occuring subarray from the left if sum equals to subarray, else print -1.

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= Ai <= 1010

Example:
Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5

Explanation :
Testcase1: sum of elements from 2nd position to 4th position is 12
Testcase2: sum of elements from 1st position to 5th position is 15
 * */

package gfgps.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SubarrayofGivenSum {
	public static void findsum(int[] a, int s) {
//		System.out.println(Arrays.toString(a));
//		System.out.println(s);
		int sum = 0;
		int firstindex = 0;
		boolean found = false;
		label: for (int i = 0; i < a.length; i++) {
			
			
			
//			int sum = 0;
//			for (int j = i; j < a.length; j++) {
//			
//				 if (sum < s) {
//					sum += a[j];
////					System.out.println(sum);
//				}
//				 else if (sum == s) {
//						System.out.println((i+1) + " " + j);
//						break label;
//					}
//
//			}
//			if(i==(a.length-1)) {
//				System.out.println("-1");
//			}
//above is valid solution but below is more optimum solution 
			sum += a[i];
			while (sum > s) {
				sum -= a[firstindex];
				firstindex++;
			}

			if (sum == s) {
				found = true;
				System.out.println(++firstindex + " " + ++i);
				break label;
			}

		}
		if (!found) {
			System.out.println("-1");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			findsum(arr, s);
		}
	}

}
