/*
 * Given an array of positive integers. Your task is to find the leaders in the array.

Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. 

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print all the leaders.

User Task:
The task is to complete the function leader() which returns an array of leaders in same order as they appear in the array. The printing is automatically done by driver code.

Constraints:
1 <= T <= 100
1 <= N <= 107
0 <= Ai <= 107

Example:
Input:
4
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
3
4 1 4

Output:
17 5 2
4 0
7 7 3
4 4

Explanation:
Testcase 3: All elements on the right of 7 (at index 0) are smaller than or equal to 7. Also, all the elements of right side of 7 (at index 3) are smaller than 7. And, the last element 3 is itself a leader since no elements are on its right.
 * 
 * */
package gfgdsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class leadersinArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr = {16, 17, 4, 3, 5, 2};
		int [] arr = {4,1, 2, 3, 4, 0};
		int max =-1;
		ArrayList<Integer> ar = new ArrayList<>();
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>=max) {
				System.out.println(arr[i]);
				ar.add(arr[i]);
				max=arr[i];
			}			
		}
		Collections.reverse(ar);
		System.out.println(ar);
	}

}
