/*Given an array arr[] of positive integers of size N. Reverse every sub-array of K group elements.

Input Format:
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of two lines of input. The first line of each test case consists of an integer N(size of array) and an integer K separated by a space. The second line of each test case contains N space separated integers denoting the array elements.

Output Format:
For each test case, in a new line, print the modified array.

User Task:
The task is to complete the function reverseInGroups() which reverses elements of the array in groups and returns the array. The printing of array is done by drivercode.

Constraints:
1 ≤ T ≤ 200
1 ≤ N, K ≤ 107
1 ≤ A[i] ≤ 1018

Example:
Input
4
5 3
1 2 3 4 5
4 3
5 6 8 9
4 7
5 6 8 9
8 3
1 2 3 4 5 6 7 8

Output
3 2 1 5 4
8 6 5 9
9 8 6 5
3 2 1 6 5 4 8 7

Explanation:
Testcase 1: Reversing groups in size 3, first group consists of elements 1, 2, 3. Reversing this group, we have elements in order as 3, 2, 1.
 * */
package gfgdsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayInGroup {


	//O(nk) time complexity
//	public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> li, int n, int k) {
//        // add your code here
//        int m = n%k;
//        if(k<n){
//        	System.out.println("hi");
//        for(int j=0;j<n-m;j+=k){
//        for(int i=0;i<k/2;i++)
//		{
//        	System.out.println("hello");
//			int temp = li.get(j+i);
//			li.set(i+j,li.get(k-1-i+j));
//			li.set(k-1-i+j, temp);
//		}
//        }
//        for(int i=0;i<m/2;k++){
//            int temp = li.get(n-m-1+i);
//			li.set(n-m-1+i,li.get(n-1-i));
//			li.set(n-1-i, temp);
//        }
//        }
//        else if (k>n){
//            for(int k1=0;k1<n/2;k1++){
//            int temp = li.get(k1);
//			li.set(k1,li.get(n-1-k1));
//			li.set(n-1-k1, temp);
//        }
//        }
//            return li;
//    }
	


// 	O(n) Time Complexity
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> li, int n, int k) {
        // add your code here
        int m = n%k;
        if(k<n){
        for(int j=0;j<n-m;j+=k){
            int low = j;
            int high = j+k-1;
            while(low<high){
                int temp = li.get(low);
                li.set(low,li.get(high));
                li.set(high,temp);
                high--;
                low++;
            }
        }
        int low = n-m;
        int high = n-1;
        while(low<high){
                int temp = li.get(low);
                li.set(low,li.get(high));
                li.set(high,temp);
                high--;
                low++;
            }
        }
        else {

        int low = 0;
        int high = n-1;
        while(low<high){
                int temp = li.get(low);
                li.set(low,li.get(high));
                li.set(high,temp);
                high--;
                low++;
            }
        }
            return li;   
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1 2 3 4 5 6 7 8
		ArrayList<Integer> li = new ArrayList<Integer>();
		int k=3;
		int n =8;
		for(int i =1;i<=n;i++) {
		li.add(i);
		}
		li = reverseInGroups(li,n,k);
		System.out.println(li);
	}
}
