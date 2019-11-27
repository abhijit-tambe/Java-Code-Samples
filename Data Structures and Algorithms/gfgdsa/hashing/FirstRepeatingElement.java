/*
 *
 * Given an array arr[] of size N. The task is to find the first repeating element in an array of integers, i.e., an element that occurs more than once and whose index of first occurrence is smallest.

Input :
The first line contains an integer T denoting the total number of test cases. In each test cases, First line is number of elements in array N and second its values.

Output:
In each separate line print the index of first repeating element, if there is not any repeating element then print “-1” (without quotes). Use 1 Based Indexing.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 106

Example:
Input:
1
7
1 5 3 4 3 5 6

Output:
2

Explanation: 
Testcase 1: 5 is appearing twice and its first appearence is at index 2 which is less than 3 whose first occuring index is 3.
 
 * 
 * 
 * *
 */
 


package gfgdsa.hashing;
import java.util.*;
import java.lang.*;
import java.io.*;

public class FirstRepeatingElement {

		 static void sol(int n , int[] arr){
	        
	        HashMap<Integer,Integer>freq = new HashMap<>();
	        int min =-1;
	        for(int i=0;i<n;i++){
	             freq.putIfAbsent(arr[i],0);
	             freq.put(arr[i],freq.get(arr[i])+1);
	        }
	        // System.out.print(freq);
	        // boolean flag =false;
	       for(int i=0;i<n;i++){
	            int a =freq.get(arr[i]);
	            if(a>1){
	                min =i+1;
	                break;
	            }
	        }
	        System.out.print(min);
	     }
	     
	     
	 
		public static void main (String[] args)
		 {
		 //code
		 Scanner sc = new Scanner(System.in);
		 int t =sc.nextInt();
		 while(t-->0){
		     int n = sc.nextInt();
		     int arr[] = new int [n];
		     for(int i=0;i<n;i++){
		         arr[i] = sc.nextInt();
		     }
		     sol(n,arr);
		 }
		 }
		 
		 
	      
	     
	    

}
