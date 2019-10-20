/*Given an array of distinct integers. The task is to count all the triplets such that sum 
 * of two elements equals the third element.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T
 test cases follow. Each test case consists of two lines. First line of each test case 
 contains an Integer N denoting size of array and the second line contains N space separated elements.

Output:
For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".

Constraints:
1 <= T <= 100
3 <= N <= 105
1 <= A[i] <= 106

Example:
Input:
2
4
1 5 3 2
3
3 2 7
Output:
2
-1

Explanation:
Testcase 1: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
 * */

package gfgps.arrays;

import java.util.Scanner;

public class CountTriplets {
	public static void findtriplet(int[] a, int n) {
		boolean found = false;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int sum = 0;
				sum = a[i] + a[j];
				for (int k = 0; k < a.length; k++) {
					if (a[k] == sum) {
						found = true;
						count++;
					}

				}
			}
		}
		if (!found) {
			System.out.println("-1");
		} else {
			System.out.println(count);
		}

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
			findtriplet(arr, n);
		}

	}

}
