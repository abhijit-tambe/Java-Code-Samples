/*Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).

Note: Expected time complexity is O((n+m) log(n+m)). DO NOT use extra space.  We need to modify existing arrays as following.

Input: arr1[] = {10};
       arr2[] = {2, 3};
Output: arr1[] = {2}
        arr2[] = {3, 10}  

Input: arr1[] = {1, 5, 9, 10, 15, 20};
       arr2[] = {2, 3, 8, 13};
Output: arr1[] = {1, 2, 3, 5, 8, 9}
        arr2[] = {10, 13, 15, 20} 
Input:
First line contains an integer T, denoting the number of test cases. First line of each test case contains two space separated integers X and Y, denoting the size of the two sorted arrays. Second line of each test case contains X space separated integers, denoting the first sorted array P. Third line of each test case contains Y space separated integers, denoting the second array Q.

Output:
For each test case, print (X + Y) space separated integer representing the merged array.

Constraints:
1 <= T <= 100
1 <= X, Y <= 5*104
0 <= arr1i, arr2i <= 109

Example:
Input:
2
4 5
1 3 5 7
0 2 6 8 9
2 3
10 12
5 18 20

Output:
0 1 2 3 5 6 7 8 9
5 10 12 18 20

Explanation:
Testcase 1: After merging two non-decreasing arrays, we have, 0 1 2 3 5 6 7 8 9.
 * */

//correct but not optimized
package gfgps.arrays;

import java.util.Scanner;

public class MergeWithoutExtraSpace {

	public static void MergeWithotAdd(int[]arr1,int []arr2) {
		int max=arr1.length<arr2.length?arr2.length:arr1.length;
		int maxlimit =arr1.length+arr2.length;
		int i=0;int j=0;
		while(maxlimit-->0) {
			if(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]){
				System.out.println(arr1[i]);
				i++;
			}else {
				System.out.println(arr2[j]);
				j++;
			}
		}
			else if(i<arr1.length) {
				System.out.println(arr1[i]);
				i++;
			}
			else {
				System.out.println(arr2[j]);
				j++;
			}
//			System.out.println("i and j"+i +" "+j);		
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int arr1[] = new int[n1];
			int arr2[] = new int[n2];
			for (int i = 0; i < n1; i++) {
				arr1[i] = sc.nextInt();
			}
			for (int i = 0; i < n2; i++) {
				arr2[i] = sc.nextInt();
			}
			MergeWithotAdd(arr1,arr2);
		}

	}

}
